package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.commonsMod.AmountWithCurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amountpayablepercycle extends StObject {
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var amount_payable_per_cycle: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The active pricing scheme version for the billing cycle. */
  var current_pricing_scheme_version: js.UndefOr[Double] = js.undefined
  
  /** The number of billing cycles that have completed. */
  var cycles_completed: Double
  
  /**
    * For a finite billing cycle, cycles_remaining is the number of remaining cycles.
    * For an infinite billing cycle, cycles_remaining is set as 0.
    */
  var cycles_remaining: js.UndefOr[Double] = js.undefined
  
  /** The order in which to run this cycle among other billing cycles. */
  var sequence: Double
  
  /** The type of the billing cycle. */
  var tenure_type: String
  
  /**
    * The number of times this billing cycle gets executed.
    * Trial billing cycles can only be executed a finite number of times (value between 1 and 999 for total_cycles)
    */
  var total_cycles: js.UndefOr[Double] = js.undefined
  
  /** The breakdown details for the amount. Includes the gross, tax, fee, and shipping amounts. */
  var total_price_per_cycle: js.UndefOr[Feeamount] = js.undefined
}
object Amountpayablepercycle {
  
  inline def apply(cycles_completed: Double, sequence: Double, tenure_type: String): Amountpayablepercycle = {
    val __obj = js.Dynamic.literal(cycles_completed = cycles_completed.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tenure_type = tenure_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountpayablepercycle]
  }
  
  extension [Self <: Amountpayablepercycle](x: Self) {
    
    inline def setAmount_payable_per_cycle(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount_payable_per_cycle", value.asInstanceOf[js.Any])
    
    inline def setAmount_payable_per_cycleUndefined: Self = StObject.set(x, "amount_payable_per_cycle", js.undefined)
    
    inline def setCurrent_pricing_scheme_version(value: Double): Self = StObject.set(x, "current_pricing_scheme_version", value.asInstanceOf[js.Any])
    
    inline def setCurrent_pricing_scheme_versionUndefined: Self = StObject.set(x, "current_pricing_scheme_version", js.undefined)
    
    inline def setCycles_completed(value: Double): Self = StObject.set(x, "cycles_completed", value.asInstanceOf[js.Any])
    
    inline def setCycles_remaining(value: Double): Self = StObject.set(x, "cycles_remaining", value.asInstanceOf[js.Any])
    
    inline def setCycles_remainingUndefined: Self = StObject.set(x, "cycles_remaining", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setTenure_type(value: String): Self = StObject.set(x, "tenure_type", value.asInstanceOf[js.Any])
    
    inline def setTotal_cycles(value: Double): Self = StObject.set(x, "total_cycles", value.asInstanceOf[js.Any])
    
    inline def setTotal_cyclesUndefined: Self = StObject.set(x, "total_cycles", js.undefined)
    
    inline def setTotal_price_per_cycle(value: Feeamount): Self = StObject.set(x, "total_price_per_cycle", value.asInstanceOf[js.Any])
    
    inline def setTotal_price_per_cycleUndefined: Self = StObject.set(x, "total_price_per_cycle", js.undefined)
  }
}
