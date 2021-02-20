package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefundResource extends Resource {
  
  val capture_id: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var invoice_number: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  val refund_funding_type: js.UndefOr[String] = js.native
  
  val refund_reason_code: js.UndefOr[String] = js.native
  
  val sale_id: js.UndefOr[String] = js.native
}
object RefundResource {
  
  @scala.inline
  def apply(amount: Amount, id: String): RefundResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundResource]
  }
  
  @scala.inline
  implicit class RefundResourceMutableBuilder[Self <: RefundResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture_id(value: String): Self = StObject.set(x, "capture_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapture_idUndefined: Self = StObject.set(x, "capture_id", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRefund_funding_type(value: String): Self = StObject.set(x, "refund_funding_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_funding_typeUndefined: Self = StObject.set(x, "refund_funding_type", js.undefined)
    
    @scala.inline
    def setRefund_reason_code(value: String): Self = StObject.set(x, "refund_reason_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_reason_codeUndefined: Self = StObject.set(x, "refund_reason_code", js.undefined)
    
    @scala.inline
    def setSale_id(value: String): Self = StObject.set(x, "sale_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSale_idUndefined: Self = StObject.set(x, "sale_id", js.undefined)
  }
}
