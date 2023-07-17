import java.util.Scanner;
public class Ciftve4unKatiOlanSayilariToplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num,sum=0;

        do {
            System.out.print("Sayı Giriniz: ");
            num=input.nextInt();

            if ((num&2)==0 && num%4==0){

                sum+=num;

            }
        }while (num%2==0);
            System.out.println("Toplam: "+sum);

    }
}