package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.AmountBreakdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountWithBreakdown extends StObject {
  
  var breakdown: js.UndefOr[AmountBreakdown] = js.undefined
  
  var currency_code: String
  
  var value: String
}
object AmountWithBreakdown {
  
  inline def apply(currency_code: String, value: String): AmountWithBreakdown = {
    val __obj = js.Dynamic.literal(currency_code = currency_code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountWithBreakdown]
  }
  
  extension [Self <: AmountWithBreakdown](x: Self) {
    
    inline def setBreakdown(value: AmountBreakdown): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
