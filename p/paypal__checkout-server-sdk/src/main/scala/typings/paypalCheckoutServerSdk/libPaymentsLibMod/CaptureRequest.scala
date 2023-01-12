package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureRequest extends StObject {
  
  var amount: Money
  
  var final_capture: Boolean
  
  var invoice_id: String
  
  var note_to_payer: String
  
  var payment_instruction: js.UndefOr[PaymentInstruction] = js.undefined
  
  var soft_descriptor: String
}
object CaptureRequest {
  
  inline def apply(
    amount: Money,
    final_capture: Boolean,
    invoice_id: String,
    note_to_payer: String,
    soft_descriptor: String
  ): CaptureRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], final_capture = final_capture.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], note_to_payer = note_to_payer.asInstanceOf[js.Any], soft_descriptor = soft_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptureRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setFinal_capture(value: Boolean): Self = StObject.set(x, "final_capture", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
    
    inline def setPayment_instruction(value: PaymentInstruction): Self = StObject.set(x, "payment_instruction", value.asInstanceOf[js.Any])
    
    inline def setPayment_instructionUndefined: Self = StObject.set(x, "payment_instruction", js.undefined)
    
    inline def setSoft_descriptor(value: String): Self = StObject.set(x, "soft_descriptor", value.asInstanceOf[js.Any])
  }
}
