package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingCost extends StObject {
  
  var amount: js.UndefOr[Currency] = js.undefined
  
  var tax: js.UndefOr[Tax] = js.undefined
}
object ShippingCost {
  
  inline def apply(): ShippingCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingCost] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setTax(value: Tax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
