package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyAmount extends StObject {
  
  /**
    * The three-character ISO-4217 currency code. PayPal does not support all currencies.
    */
  var currency: String = js.native
  
  /**
    * The amount the shipping option will cost. Includes the specified number of digits after
    * decimal separator for the ISO-4217 currency code.
    */
  var value: String = js.native
}
object CurrencyAmount {
  
  @scala.inline
  def apply(currency: String, value: String): CurrencyAmount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyAmount]
  }
  
  @scala.inline
  implicit class CurrencyAmountMutableBuilder[Self <: CurrencyAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
