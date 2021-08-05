package typings.payment

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("payment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("payment", "fns")
  @js.native
  def fns: Fns = js.native
  inline def fns_=(x: Fns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fns")(x.asInstanceOf[js.Any])
  
  /**
    * Formats card CVC:
    * * Restricts length to 4 numbers
    * * Restricts input to numbers
    */
  inline def formatCardCVC(elem: HTMLInputElement): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardCVC")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  /**
    * Formats card expiry:
    * * Includes a / between the month and year
    * * Restricts input to numbers
    * * Restricts length
    */
  inline def formatCardExpiry(elem: HTMLInputElement): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardExpiry")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  /**
    * Formats card numbers:
    * * Includes a space between every 4 digits
    * * Restricts input to numbers
    * * Limits to 16 numbers
    * * Supports American Express formatting
    * * Adds a class of the card type (e.g. 'visa') to the input
    */
  inline def formatCardNumber(elem: HTMLInputElement): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardNumber")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  /**
    * General numeric input restriction.
    */
  inline def restrictNumeric(elem: HTMLInputElement): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictNumeric")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  @js.native
  trait Fns extends StObject {
    
    /**
      * Parses a credit card expiry in the form of MM/YYYY, returning an object containing the `month` and `year`.
      * Shorthand years, such as `13` are also supported (and converted into the longhand, e.g. `2013`).
      */
    def cardExpiryVal(monthYear: String): MonthYear = js.native
    def cardExpiryVal(monthYear: HTMLInputElement): MonthYear = js.native
    
    /**
      * Returns a card type. Either:
      * * visa
      * * mastercard
      * * discover
      * * amex
      * * jcb
      * * dinersclub
      * * maestro
      * * laser
      * * unionpay
      * * elo
      *
      * The function will return null if the card type can't be determined.
      */
    def cardType(cardNumber: String): String = js.native
    
    /**
      * Formats a card number
      */
    def formatCardNumber(cardNumber: String): String = js.native
    
    /**
      * Validates a card CVC:
      * * Validates number
      * * Validates length to 4
      */
    def validateCardCVC(cvc: String): Boolean = js.native
    def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
    
    /**
      * Validates a card expiry:
      * * Validates numbers
      * * Validates in the future
      * * Supports year shorthand
      * * Supports formatted as formatCardExpiry input value
      */
    def validateCardExpiry(monthYear: String): Boolean = js.native
    def validateCardExpiry(monthYear: String, year: String): Boolean = js.native
    
    /**
      * Validates a card number:
      * * Validates numbers
      * * Validates Luhn algorithm
      * * Validates length
      */
    def validateCardNumber(cardNumber: String): Boolean = js.native
  }
  
  trait MonthYear extends StObject {
    
    var month: Double
    
    var year: Double
  }
  object MonthYear {
    
    inline def apply(month: Double, year: Double): MonthYear = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthYear]
    }
    
    extension [Self <: MonthYear](x: Self) {
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
