package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRequest extends StObject {
  
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var end_creation_date: js.UndefOr[String] = js.undefined
  
  var end_due_date: js.UndefOr[String] = js.undefined
  
  var end_invoice_date: js.UndefOr[String] = js.undefined
  
  var end_payment_date: js.UndefOr[String] = js.undefined
  
  var lower_total_amount: js.UndefOr[Currency] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var page_size: js.UndefOr[Double] = js.undefined
  
  var recipient_business_name: js.UndefOr[String] = js.undefined
  
  var recipient_first_name: js.UndefOr[String] = js.undefined
  
  var recipient_last_name: js.UndefOr[String] = js.undefined
  
  var start_creation_date: js.UndefOr[String] = js.undefined
  
  var start_due_date: js.UndefOr[String] = js.undefined
  
  var start_invoice_date: js.UndefOr[String] = js.undefined
  
  var start_payment_date: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var total_count_required: js.UndefOr[Boolean] = js.undefined
  
  var upper_total_amount: js.UndefOr[Currency] = js.undefined
}
object SearchRequest {
  
  @scala.inline
  def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  @scala.inline
  implicit class SearchRequestMutableBuilder[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEnd_creation_date(value: String): Self = StObject.set(x, "end_creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_creation_dateUndefined: Self = StObject.set(x, "end_creation_date", js.undefined)
    
    @scala.inline
    def setEnd_due_date(value: String): Self = StObject.set(x, "end_due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_due_dateUndefined: Self = StObject.set(x, "end_due_date", js.undefined)
    
    @scala.inline
    def setEnd_invoice_date(value: String): Self = StObject.set(x, "end_invoice_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_invoice_dateUndefined: Self = StObject.set(x, "end_invoice_date", js.undefined)
    
    @scala.inline
    def setEnd_payment_date(value: String): Self = StObject.set(x, "end_payment_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_payment_dateUndefined: Self = StObject.set(x, "end_payment_date", js.undefined)
    
    @scala.inline
    def setLower_total_amount(value: Currency): Self = StObject.set(x, "lower_total_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower_total_amountUndefined: Self = StObject.set(x, "lower_total_amount", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
    
    @scala.inline
    def setRecipient_business_name(value: String): Self = StObject.set(x, "recipient_business_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_business_nameUndefined: Self = StObject.set(x, "recipient_business_name", js.undefined)
    
    @scala.inline
    def setRecipient_first_name(value: String): Self = StObject.set(x, "recipient_first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_first_nameUndefined: Self = StObject.set(x, "recipient_first_name", js.undefined)
    
    @scala.inline
    def setRecipient_last_name(value: String): Self = StObject.set(x, "recipient_last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_last_nameUndefined: Self = StObject.set(x, "recipient_last_name", js.undefined)
    
    @scala.inline
    def setStart_creation_date(value: String): Self = StObject.set(x, "start_creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_creation_dateUndefined: Self = StObject.set(x, "start_creation_date", js.undefined)
    
    @scala.inline
    def setStart_due_date(value: String): Self = StObject.set(x, "start_due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_due_dateUndefined: Self = StObject.set(x, "start_due_date", js.undefined)
    
    @scala.inline
    def setStart_invoice_date(value: String): Self = StObject.set(x, "start_invoice_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_invoice_dateUndefined: Self = StObject.set(x, "start_invoice_date", js.undefined)
    
    @scala.inline
    def setStart_payment_date(value: String): Self = StObject.set(x, "start_payment_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_payment_dateUndefined: Self = StObject.set(x, "start_payment_date", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTotal_count_required(value: Boolean): Self = StObject.set(x, "total_count_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count_requiredUndefined: Self = StObject.set(x, "total_count_required", js.undefined)
    
    @scala.inline
    def setUpper_total_amount(value: Currency): Self = StObject.set(x, "upper_total_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper_total_amountUndefined: Self = StObject.set(x, "upper_total_amount", js.undefined)
  }
}
