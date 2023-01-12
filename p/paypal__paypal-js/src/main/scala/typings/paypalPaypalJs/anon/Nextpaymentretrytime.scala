package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.PaymentFailureReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nextpaymentretrytime extends StObject {
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var amount: AmountWithCurrencyCode
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var next_payment_retry_time: js.UndefOr[String] = js.undefined
  
  /** The reason code for the payment failure. */
  var reason_code: js.UndefOr[PaymentFailureReason] = js.undefined
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var time: String
}
object Nextpaymentretrytime {
  
  inline def apply(amount: AmountWithCurrencyCode, time: String): Nextpaymentretrytime = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nextpaymentretrytime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nextpaymentretrytime] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setNext_payment_retry_time(value: String): Self = StObject.set(x, "next_payment_retry_time", value.asInstanceOf[js.Any])
    
    inline def setNext_payment_retry_timeUndefined: Self = StObject.set(x, "next_payment_retry_time", js.undefined)
    
    inline def setReason_code(value: PaymentFailureReason): Self = StObject.set(x, "reason_code", value.asInstanceOf[js.Any])
    
    inline def setReason_codeUndefined: Self = StObject.set(x, "reason_code", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
