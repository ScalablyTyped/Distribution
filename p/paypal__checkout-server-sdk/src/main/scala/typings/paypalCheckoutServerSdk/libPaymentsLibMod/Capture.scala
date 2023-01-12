package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capture
  extends StObject
     with ActivityTimestamps
     with CaptureStatus {
  
  var amount: Money
  
  var custom_id: String
  
  var disbursement_mode: DisbursementMode
  
  var final_capture: Boolean
  
  var id: String
  
  var invoice_id: String
  
  var links: js.Array[LinkDescription]
  
  var processor_response: ProcessorResponse
  
  var seller_protection: SellerProtection
  
  var seller_receivable_breakdown: SellerReceivableBreakdown
}
object Capture {
  
  inline def apply(
    amount: Money,
    create_time: String,
    custom_id: String,
    disbursement_mode: DisbursementMode,
    final_capture: Boolean,
    id: String,
    invoice_id: String,
    links: js.Array[LinkDescription],
    processor_response: ProcessorResponse,
    seller_protection: SellerProtection,
    seller_receivable_breakdown: SellerReceivableBreakdown,
    status: Status,
    status_details: CaptureStatusDetails,
    update_time: String
  ): Capture = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], custom_id = custom_id.asInstanceOf[js.Any], disbursement_mode = disbursement_mode.asInstanceOf[js.Any], final_capture = final_capture.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], processor_response = processor_response.asInstanceOf[js.Any], seller_protection = seller_protection.asInstanceOf[js.Any], seller_receivable_breakdown = seller_receivable_breakdown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_details = status_details.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capture] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
    
    inline def setDisbursement_mode(value: DisbursementMode): Self = StObject.set(x, "disbursement_mode", value.asInstanceOf[js.Any])
    
    inline def setFinal_capture(value: Boolean): Self = StObject.set(x, "final_capture", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setProcessor_response(value: ProcessorResponse): Self = StObject.set(x, "processor_response", value.asInstanceOf[js.Any])
    
    inline def setSeller_protection(value: SellerProtection): Self = StObject.set(x, "seller_protection", value.asInstanceOf[js.Any])
    
    inline def setSeller_receivable_breakdown(value: SellerReceivableBreakdown): Self = StObject.set(x, "seller_receivable_breakdown", value.asInstanceOf[js.Any])
  }
}
