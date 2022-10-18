package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentInstruction extends StObject {
  
  var disbursement_mode: DisbursementMode
  
  var payee_pricing_tier_id: String
  
  var platform_fees: js.Array[PlatformFee]
}
object PaymentInstruction {
  
  inline def apply(
    disbursement_mode: DisbursementMode,
    payee_pricing_tier_id: String,
    platform_fees: js.Array[PlatformFee]
  ): PaymentInstruction = {
    val __obj = js.Dynamic.literal(disbursement_mode = disbursement_mode.asInstanceOf[js.Any], payee_pricing_tier_id = payee_pricing_tier_id.asInstanceOf[js.Any], platform_fees = platform_fees.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentInstruction]
  }
  
  extension [Self <: PaymentInstruction](x: Self) {
    
    inline def setDisbursement_mode(value: DisbursementMode): Self = StObject.set(x, "disbursement_mode", value.asInstanceOf[js.Any])
    
    inline def setPayee_pricing_tier_id(value: String): Self = StObject.set(x, "payee_pricing_tier_id", value.asInstanceOf[js.Any])
    
    inline def setPlatform_fees(value: js.Array[PlatformFee]): Self = StObject.set(x, "platform_fees", value.asInstanceOf[js.Any])
    
    inline def setPlatform_feesVarargs(value: PlatformFee*): Self = StObject.set(x, "platform_fees", js.Array(value*))
  }
}
