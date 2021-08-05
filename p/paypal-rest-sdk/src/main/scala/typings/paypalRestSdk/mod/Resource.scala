package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  var amount: Amount
  
  val create_time: js.UndefOr[String] = js.undefined
  
  val fmf_details: js.UndefOr[FraudManagementFiltersDetails] = js.undefined
  
  val id: String
  
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  
  val parent_payment: js.UndefOr[String] = js.undefined
  
  val payment_mode: js.UndefOr[String] = js.undefined
  
  val processor_response: js.UndefOr[js.Any] = js.undefined
  
  val protection_eligibility: js.UndefOr[String] = js.undefined
  
  val protection_eligibility_type: js.UndefOr[String] = js.undefined
  
  val reason_code: js.UndefOr[String] = js.undefined
  
  val receipt_id: js.UndefOr[String] = js.undefined
  
  val state: js.UndefOr[String] = js.undefined
  
  val update_time: js.UndefOr[String] = js.undefined
}
object Resource {
  
  inline def apply(amount: Amount, id: String): Resource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setFmf_details(value: FraudManagementFiltersDetails): Self = StObject.set(x, "fmf_details", value.asInstanceOf[js.Any])
    
    inline def setFmf_detailsUndefined: Self = StObject.set(x, "fmf_details", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setParent_payment(value: String): Self = StObject.set(x, "parent_payment", value.asInstanceOf[js.Any])
    
    inline def setParent_paymentUndefined: Self = StObject.set(x, "parent_payment", js.undefined)
    
    inline def setPayment_mode(value: String): Self = StObject.set(x, "payment_mode", value.asInstanceOf[js.Any])
    
    inline def setPayment_modeUndefined: Self = StObject.set(x, "payment_mode", js.undefined)
    
    inline def setProcessor_response(value: js.Any): Self = StObject.set(x, "processor_response", value.asInstanceOf[js.Any])
    
    inline def setProcessor_responseUndefined: Self = StObject.set(x, "processor_response", js.undefined)
    
    inline def setProtection_eligibility(value: String): Self = StObject.set(x, "protection_eligibility", value.asInstanceOf[js.Any])
    
    inline def setProtection_eligibilityUndefined: Self = StObject.set(x, "protection_eligibility", js.undefined)
    
    inline def setProtection_eligibility_type(value: String): Self = StObject.set(x, "protection_eligibility_type", value.asInstanceOf[js.Any])
    
    inline def setProtection_eligibility_typeUndefined: Self = StObject.set(x, "protection_eligibility_type", js.undefined)
    
    inline def setReason_code(value: String): Self = StObject.set(x, "reason_code", value.asInstanceOf[js.Any])
    
    inline def setReason_codeUndefined: Self = StObject.set(x, "reason_code", js.undefined)
    
    inline def setReceipt_id(value: String): Self = StObject.set(x, "receipt_id", value.asInstanceOf[js.Any])
    
    inline def setReceipt_idUndefined: Self = StObject.set(x, "receipt_id", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    inline def setUpdate_timeUndefined: Self = StObject.set(x, "update_time", js.undefined)
  }
}
