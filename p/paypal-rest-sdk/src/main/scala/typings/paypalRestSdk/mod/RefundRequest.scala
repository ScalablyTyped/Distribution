package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefundRequest extends StObject {
  
  var amount: js.UndefOr[Amount] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var invoice_number: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var payer_info: js.UndefOr[PayerInfo] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var refund_advice: js.UndefOr[Boolean] = js.undefined
  
  var refund_source: js.UndefOr[String] = js.undefined
  
  var supplementary_data: js.UndefOr[js.Array[Any]] = js.undefined
}
object RefundRequest {
  
  inline def apply(): RefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefundRequest]
  }
  
  extension [Self <: RefundRequest](x: Self) {
    
    inline def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInvoice_number(value: String): Self = StObject.set(x, "invoice_number", value.asInstanceOf[js.Any])
    
    inline def setInvoice_numberUndefined: Self = StObject.set(x, "invoice_number", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPayer_info(value: PayerInfo): Self = StObject.set(x, "payer_info", value.asInstanceOf[js.Any])
    
    inline def setPayer_infoUndefined: Self = StObject.set(x, "payer_info", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRefund_advice(value: Boolean): Self = StObject.set(x, "refund_advice", value.asInstanceOf[js.Any])
    
    inline def setRefund_adviceUndefined: Self = StObject.set(x, "refund_advice", js.undefined)
    
    inline def setRefund_source(value: String): Self = StObject.set(x, "refund_source", value.asInstanceOf[js.Any])
    
    inline def setRefund_sourceUndefined: Self = StObject.set(x, "refund_source", js.undefined)
    
    inline def setSupplementary_data(value: js.Array[Any]): Self = StObject.set(x, "supplementary_data", value.asInstanceOf[js.Any])
    
    inline def setSupplementary_dataUndefined: Self = StObject.set(x, "supplementary_data", js.undefined)
    
    inline def setSupplementary_dataVarargs(value: Any*): Self = StObject.set(x, "supplementary_data", js.Array(value*))
  }
}
