import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi1, sayi2, islem;

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        sayi2 = input.nextInt();
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("Hangi işlemi yapmak istiyorsunuz : ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("İşlem sonucunuz : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("İşlem sonucunuz : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("İşlem sonucunuz : " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("İşlem sonucunuz : " + (sayi1 / sayi2));
                } else {
                    System.out.println("0 ' a bölünmez.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem numarası seçtiniz.");
        }
    }
}
