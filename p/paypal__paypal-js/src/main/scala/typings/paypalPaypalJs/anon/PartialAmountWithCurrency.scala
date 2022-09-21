package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode> */
trait PartialAmountWithCurrency extends StObject {
  
  var currency_code: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PartialAmountWithCurrency {
  
  inline def apply(): PartialAmountWithCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAmountWithCurrency]
  }
  
  extension [Self <: PartialAmountWithCurrency](x: Self) {
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
