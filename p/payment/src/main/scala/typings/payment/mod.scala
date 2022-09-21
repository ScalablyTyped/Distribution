package typings.payment

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("payment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a new card type to the card array.
    */
  inline def addToCardArray(cardType: CardType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addToCardArray")(cardType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    * Returns the array of card types.
    */
  inline def getCardArray(): js.Array[CardType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardArray")().asInstanceOf[js.Array[CardType]]
  
  /**
    * Remove a card type from the card array.
    */
  inline def removeFromCardArray(cardName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCardArray")(cardName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * General numeric input restriction.
    */
  inline def restrictNumeric(elem: HTMLInputElement): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictNumeric")(elem.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  /**
    * Overrides the array of card types with a new array.
    */
  inline def setCardArray(cardTypes: js.Array[CardType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCardArray")(cardTypes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CardType extends StObject {
    
    var cvcLength: js.Array[Double]
    
    var format: js.RegExp
    
    var length: js.Array[Double]
    
    var luhn: Boolean
    
    var pattern: js.RegExp
    
    var `type`: String
  }
  object CardType {
    
    inline def apply(
      cvcLength: js.Array[Double],
      format: js.RegExp,
      length: js.Array[Double],
      luhn: Boolean,
      pattern: js.RegExp,
      `type`: String
    ): CardType = {
      val __obj = js.Dynamic.literal(cvcLength = cvcLength.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], luhn = luhn.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardType]
    }
    
    extension [Self <: CardType](x: Self) {
      
      inline def setCvcLength(value: js.Array[Double]): Self = StObject.set(x, "cvcLength", value.asInstanceOf[js.Any])
      
      inline def setCvcLengthVarargs(value: Double*): Self = StObject.set(x, "cvcLength", js.Array(value*))
      
      inline def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setLength(value: js.Array[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthVarargs(value: Double*): Self = StObject.set(x, "length", js.Array(value*))
      
      inline def setLuhn(value: Boolean): Self = StObject.set(x, "luhn", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
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
