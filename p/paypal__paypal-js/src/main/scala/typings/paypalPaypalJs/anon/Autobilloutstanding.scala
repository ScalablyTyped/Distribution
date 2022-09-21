package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.commonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.paypalPaypalJsStrings.CANCEL
import typings.paypalPaypalJs.paypalPaypalJsStrings.CONTINUE
import typings.paypalPaypalJs.paypalPaypalJsStrings.POSTPAID
import typings.paypalPaypalJs.paypalPaypalJsStrings.PREPAID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autobilloutstanding extends StObject {
  
  /** Indicates whether to automatically bill the outstanding amount in the next billing cycle. */
  var auto_bill_outstanding: Boolean
  
  /**
    * The maximum number of payment failures before a subscription is suspended.
    * For example, if `payment_failure_threshold` is `2`,
    * the subscription automatically updates to the `SUSPEND` state if two consecutive payments fail.
    */
  var payment_failure_threshold: Double
  
  /** A pre or post paid service. */
  var service_type: PREPAID | POSTPAID
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var setup_fee: AmountWithCurrencyCode
  
  /** The action to take on the subscription if the initial payment for the setup fails. */
  var setup_fee_failure_action: CONTINUE | CANCEL
}
object Autobilloutstanding {
  
  inline def apply(
    auto_bill_outstanding: Boolean,
    payment_failure_threshold: Double,
    service_type: PREPAID | POSTPAID,
    setup_fee: AmountWithCurrencyCode,
    setup_fee_failure_action: CONTINUE | CANCEL
  ): Autobilloutstanding = {
    val __obj = js.Dynamic.literal(auto_bill_outstanding = auto_bill_outstanding.asInstanceOf[js.Any], payment_failure_threshold = payment_failure_threshold.asInstanceOf[js.Any], service_type = service_type.asInstanceOf[js.Any], setup_fee = setup_fee.asInstanceOf[js.Any], setup_fee_failure_action = setup_fee_failure_action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autobilloutstanding]
  }
  
  extension [Self <: Autobilloutstanding](x: Self) {
    
    inline def setAuto_bill_outstanding(value: Boolean): Self = StObject.set(x, "auto_bill_outstanding", value.asInstanceOf[js.Any])
    
    inline def setPayment_failure_threshold(value: Double): Self = StObject.set(x, "payment_failure_threshold", value.asInstanceOf[js.Any])
    
    inline def setService_type(value: PREPAID | POSTPAID): Self = StObject.set(x, "service_type", value.asInstanceOf[js.Any])
    
    inline def setSetup_fee(value: AmountWithCurrencyCode): Self = StObject.set(x, "setup_fee", value.asInstanceOf[js.Any])
    
    inline def setSetup_fee_failure_action(value: CONTINUE | CANCEL): Self = StObject.set(x, "setup_fee_failure_action", value.asInstanceOf[js.Any])
  }
}
