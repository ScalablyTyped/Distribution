package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.REGULAR
import typings.paypalPaypalJs.paypalPaypalJsStrings.TRIAL
import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.typesApisCommonsMod.Taxes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frequency extends StObject {
  
  /** The frequency of the billing cycle. */
  var frequency: Intervalcount
  
  /** The pricing scheme details. */
  var pricing_scheme: js.UndefOr[Partial[Createtime]] = js.undefined
  
  /**
    * The order in which this cycle is to run among other billing cycles.
    * For example, a trial billing cycle has a `sequence` of `1` while a regular billing cycle has a `sequence` of `2`,
    * so that trial cycle runs before the regular cycle.
    */
  var sequence: Double
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var shipping_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** The tax details. */
  var taxes: js.UndefOr[Taxes] = js.undefined
  
  /**
    * The tenure type of the billing cycle.
    * In case of a plan having trial cycle, only 2 trial cycles are allowed per plan.
    */
  var tenure_type: REGULAR | TRIAL
  
  /**
    * The number of times this billing cycle gets executed.
    * Trial billing cycles can only be executed a finite number of times (value between 1 and 999 for total_cycles).
    * Regular billing cycles can be executed infinite times (value of 0 for total_cycles)
    * or a finite number of times (value between 1 and 999 for total_cycles).
    */
  var total_cycles: js.UndefOr[Double] = js.undefined
}
object Frequency {
  
  inline def apply(frequency: Intervalcount, sequence: Double, tenure_type: REGULAR | TRIAL): Frequency = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], tenure_type = tenure_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frequency]
  }
  
  extension [Self <: Frequency](x: Self) {
    
    inline def setFrequency(value: Intervalcount): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setPricing_scheme(value: Partial[Createtime]): Self = StObject.set(x, "pricing_scheme", value.asInstanceOf[js.Any])
    
    inline def setPricing_schemeUndefined: Self = StObject.set(x, "pricing_scheme", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setShipping_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping_amount", value.asInstanceOf[js.Any])
    
    inline def setShipping_amountUndefined: Self = StObject.set(x, "shipping_amount", js.undefined)
    
    inline def setTaxes(value: Taxes): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTenure_type(value: REGULAR | TRIAL): Self = StObject.set(x, "tenure_type", value.asInstanceOf[js.Any])
    
    inline def setTotal_cycles(value: Double): Self = StObject.set(x, "total_cycles", value.asInstanceOf[js.Any])
    
    inline def setTotal_cyclesUndefined: Self = StObject.set(x, "total_cycles", js.undefined)
  }
}
