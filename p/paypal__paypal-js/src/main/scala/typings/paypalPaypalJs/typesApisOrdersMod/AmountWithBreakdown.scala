package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.anon.Discount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountWithBreakdown
  extends StObject
     with AmountWithCurrencyCodeOptional {
  
  var breakdown: js.UndefOr[Discount] = js.undefined
}
object AmountWithBreakdown {
  
  inline def apply(value: String): AmountWithBreakdown = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountWithBreakdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmountWithBreakdown] (val x: Self) extends AnyVal {
    
    inline def setBreakdown(value: Discount): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
  }
}
