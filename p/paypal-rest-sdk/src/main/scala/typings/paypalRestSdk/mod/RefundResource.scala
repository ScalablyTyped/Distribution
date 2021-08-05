package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundResource
  extends StObject
     with Resource {
  
  val capture_id: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var invoice_number: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  val refund_funding_type: js.UndefOr[String] = js.undefined
  
  val refund_reason_code: js.UndefOr[String] = js.undefined
  
  val sale_id: js.UndefOr[String] = js.undefined
}
object RefundResource {
  
  inline def apply(amount: Amount, id: String): RefundResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundResource]
  }
  
  extension [Self <: RefundResource](x: Self) {
    
    inline def setCapture_id(value: String): Self = StObject.set(x, "capture_id", value.asInstanceOf[js.Any])
    
    inline def setCapture_idUndefined: Self = StObject.set(x, "capture_id", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    inline def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRefund_funding_type(value: String): Self = StObject.set(x, "refund_funding_type", value.asInstanceOf[js.Any])
    
    inline def setRefund_funding_typeUndefined: Self = StObject.set(x, "refund_funding_type", js.undefined)
    
    inline def setRefund_reason_code(value: String): Self = StObject.set(x, "refund_reason_code", value.asInstanceOf[js.Any])
    
    inline def setRefund_reason_codeUndefined: Self = StObject.set(x, "refund_reason_code", js.undefined)
    
    inline def setSale_id(value: String): Self = StObject.set(x, "sale_id", value.asInstanceOf[js.Any])
    
    inline def setSale_idUndefined: Self = StObject.set(x, "sale_id", js.undefined)
  }
}
