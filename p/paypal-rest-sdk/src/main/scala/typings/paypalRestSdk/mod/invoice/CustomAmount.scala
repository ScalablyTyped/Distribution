package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAmount extends StObject {
  
  var amount: Currency
  
  var label: String
}
object CustomAmount {
  
  @scala.inline
  def apply(amount: Currency, label: String): CustomAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAmount]
  }
  
  @scala.inline
  implicit class CustomAmountMutableBuilder[Self <: CustomAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
