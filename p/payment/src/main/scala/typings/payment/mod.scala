package typings.payment

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("payment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("payment", "fns")
  @js.native
  def fns: Fns = js.native
  @scala.inline
  def fns_=(x: Fns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fns")(x.asInstanceOf[js.Any])
  
  /**
    * Formats card CVC:
    * * Restricts length to 4 numbers
    * * Restricts input to numbers
    */
  @JSImport("payment", "formatCardCVC")
  @js.native
  def formatCardCVC(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * Formats card expiry:
    * * Includes a / between the month and year
    * * Restricts input to numbers
    * * Restricts length
    */
  @JSImport("payment", "formatCardExpiry")
  @js.native
  def formatCardExpiry(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * Formats card numbers:
    * * Includes a space between every 4 digits
    * * Restricts input to numbers
    * * Limits to 16 numbers
    * * Supports American Express formatting
    * * Adds a class of the card type (e.g. 'visa') to the input
    */
  @JSImport("payment", "formatCardNumber")
  @js.native
  def formatCardNumber(elem: HTMLInputElement): HTMLInputElement = js.native
  
  /**
    * General numeric input restriction.
    */
  @JSImport("payment", "restrictNumeric")
  @js.native
  def restrictNumeric(elem: HTMLInputElement): HTMLInputElement = js.native
  
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
  
  @js.native
  trait MonthYear extends StObject {
    
    var month: Double = js.native
    
    var year: Double = js.native
  }
  object MonthYear {
    
    @scala.inline
    def apply(month: Double, year: Double): MonthYear = {
      val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthYear]
    }
    
    @scala.inline
    implicit class MonthYearMutableBuilder[Self <: MonthYear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
}
