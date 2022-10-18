package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPaymentCapturePartialPayloadDotmodelMod {
  
  trait CapturePartialPaymentPayload extends StObject {
    
    /** Payment id. */
    var id: Double
    
    /** New amount. */
    var transaction_amount: js.UndefOr[Double] = js.undefined
  }
  object CapturePartialPaymentPayload {
    
    inline def apply(id: Double): CapturePartialPaymentPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapturePartialPaymentPayload]
    }
    
    extension [Self <: CapturePartialPaymentPayload](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTransaction_amount(value: Double): Self = StObject.set(x, "transaction_amount", value.asInstanceOf[js.Any])
      
      inline def setTransaction_amountUndefined: Self = StObject.set(x, "transaction_amount", js.undefined)
    }
  }
}
