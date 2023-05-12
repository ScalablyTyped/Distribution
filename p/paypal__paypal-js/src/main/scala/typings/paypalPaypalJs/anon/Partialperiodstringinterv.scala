package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  period :string,   interval_duration :string,   payment_due :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode>}> */
trait Partialperiodstringinterv extends StObject {
  
  var interval_duration: js.UndefOr[String] = js.undefined
  
  var payment_due: js.UndefOr[PartialAmountWithCurrency] = js.undefined
  
  var period: js.UndefOr[String] = js.undefined
}
object Partialperiodstringinterv {
  
  inline def apply(): Partialperiodstringinterv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialperiodstringinterv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialperiodstringinterv] (val x: Self) extends AnyVal {
    
    inline def setInterval_duration(value: String): Self = StObject.set(x, "interval_duration", value.asInstanceOf[js.Any])
    
    inline def setInterval_durationUndefined: Self = StObject.set(x, "interval_duration", js.undefined)
    
    inline def setPayment_due(value: PartialAmountWithCurrency): Self = StObject.set(x, "payment_due", value.asInstanceOf[js.Any])
    
    inline def setPayment_dueUndefined: Self = StObject.set(x, "payment_due", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
