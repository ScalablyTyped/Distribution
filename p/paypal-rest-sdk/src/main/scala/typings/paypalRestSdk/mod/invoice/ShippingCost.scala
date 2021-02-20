package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingCost extends StObject {
  
  var amount: js.UndefOr[Currency] = js.native
  
  var tax: js.UndefOr[Tax] = js.native
}
object ShippingCost {
  
  @scala.inline
  def apply(): ShippingCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingCost]
  }
  
  @scala.inline
  implicit class ShippingCostMutableBuilder[Self <: ShippingCost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setTax(value: Tax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
