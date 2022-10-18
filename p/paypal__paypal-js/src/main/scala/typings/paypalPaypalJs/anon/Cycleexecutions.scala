package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cycleexecutions extends StObject {
  
  var cycle_executions: js.UndefOr[js.Array[Amountpayablepercycle]] = js.undefined
  
  /**
    * The number of consecutive payment failures. Resets to `0` after a successful payment.
    * If this reaches the `payment_failure_threshold` value, the subscription updates to the `SUSPENDED` state.
    */
  var failed_payments_count: Double
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var final_payment_time: js.UndefOr[String] = js.undefined
  
  /** The details for the failed payment of the subscription. */
  var last_failed_payment: js.UndefOr[Nextpaymentretrytime] = js.undefined
  
  /** The details for the last payment. */
  var last_payment: js.UndefOr[Receivertransactionid] = js.undefined
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6) */
  var next_billing_time: js.UndefOr[String] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var next_payment: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var outstanding_balance: AmountWithCurrencyCode
  
  /** Time interval (in days) after which the future subscription billing cycles are affected with the new pricing change. */
  var price_change_effective_after: js.UndefOr[Double] = js.undefined
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var total_paid_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
}
object Cycleexecutions {
  
  inline def apply(failed_payments_count: Double, outstanding_balance: AmountWithCurrencyCode): Cycleexecutions = {
    val __obj = js.Dynamic.literal(failed_payments_count = failed_payments_count.asInstanceOf[js.Any], outstanding_balance = outstanding_balance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cycleexecutions]
  }
  
  extension [Self <: Cycleexecutions](x: Self) {
    
    inline def setCycle_executions(value: js.Array[Amountpayablepercycle]): Self = StObject.set(x, "cycle_executions", value.asInstanceOf[js.Any])
    
    inline def setCycle_executionsUndefined: Self = StObject.set(x, "cycle_executions", js.undefined)
    
    inline def setCycle_executionsVarargs(value: Amountpayablepercycle*): Self = StObject.set(x, "cycle_executions", js.Array(value*))
    
    inline def setFailed_payments_count(value: Double): Self = StObject.set(x, "failed_payments_count", value.asInstanceOf[js.Any])
    
    inline def setFinal_payment_time(value: String): Self = StObject.set(x, "final_payment_time", value.asInstanceOf[js.Any])
    
    inline def setFinal_payment_timeUndefined: Self = StObject.set(x, "final_payment_time", js.undefined)
    
    inline def setLast_failed_payment(value: Nextpaymentretrytime): Self = StObject.set(x, "last_failed_payment", value.asInstanceOf[js.Any])
    
    inline def setLast_failed_paymentUndefined: Self = StObject.set(x, "last_failed_payment", js.undefined)
    
    inline def setLast_payment(value: Receivertransactionid): Self = StObject.set(x, "last_payment", value.asInstanceOf[js.Any])
    
    inline def setLast_paymentUndefined: Self = StObject.set(x, "last_payment", js.undefined)
    
    inline def setNext_billing_time(value: String): Self = StObject.set(x, "next_billing_time", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_timeUndefined: Self = StObject.set(x, "next_billing_time", js.undefined)
    
    inline def setNext_payment(value: AmountWithCurrencyCode): Self = StObject.set(x, "next_payment", value.asInstanceOf[js.Any])
    
    inline def setNext_paymentUndefined: Self = StObject.set(x, "next_payment", js.undefined)
    
    inline def setOutstanding_balance(value: AmountWithCurrencyCode): Self = StObject.set(x, "outstanding_balance", value.asInstanceOf[js.Any])
    
    inline def setPrice_change_effective_after(value: Double): Self = StObject.set(x, "price_change_effective_after", value.asInstanceOf[js.Any])
    
    inline def setPrice_change_effective_afterUndefined: Self = StObject.set(x, "price_change_effective_after", js.undefined)
    
    inline def setTotal_paid_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "total_paid_amount", value.asInstanceOf[js.Any])
    
    inline def setTotal_paid_amountUndefined: Self = StObject.set(x, "total_paid_amount", js.undefined)
  }
}
