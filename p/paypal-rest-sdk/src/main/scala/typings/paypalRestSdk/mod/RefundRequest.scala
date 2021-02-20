package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefundRequest extends StObject {
  
  var amount: js.UndefOr[Amount] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var invoice_number: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var payer_info: js.UndefOr[PayerInfo] = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var refund_advice: js.UndefOr[Boolean] = js.native
  
  var refund_source: js.UndefOr[String] = js.native
  
  var supplementary_data: js.UndefOr[js.Array[_]] = js.native
}
object RefundRequest {
  
  @scala.inline
  def apply(): RefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefundRequest]
  }
  
  @scala.inline
  implicit class RefundRequestMutableBuilder[Self <: RefundRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPayer_info(value: PayerInfo): Self = StObject.set(x, "payer_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayer_infoUndefined: Self = StObject.set(x, "payer_info", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRefund_advice(value: Boolean): Self = StObject.set(x, "refund_advice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_adviceUndefined: Self = StObject.set(x, "refund_advice", js.undefined)
    
    @scala.inline
    def setRefund_source(value: String): Self = StObject.set(x, "refund_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefund_sourceUndefined: Self = StObject.set(x, "refund_source", js.undefined)
    
    @scala.inline
    def setSupplementary_data(value: js.Array[_]): Self = StObject.set(x, "supplementary_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementary_dataUndefined: Self = StObject.set(x, "supplementary_data", js.undefined)
    
    @scala.inline
    def setSupplementary_dataVarargs(value: js.Any*): Self = StObject.set(x, "supplementary_data", js.Array(value :_*))
  }
}
