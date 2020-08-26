package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRequest extends js.Object {
  var archived: js.UndefOr[Boolean] = js.native
  var email: js.UndefOr[String] = js.native
  var end_creation_date: js.UndefOr[String] = js.native
  var end_due_date: js.UndefOr[String] = js.native
  var end_invoice_date: js.UndefOr[String] = js.native
  var end_payment_date: js.UndefOr[String] = js.native
  var lower_total_amount: js.UndefOr[Currency] = js.native
  var number: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var page_size: js.UndefOr[Double] = js.native
  var recipient_business_name: js.UndefOr[String] = js.native
  var recipient_first_name: js.UndefOr[String] = js.native
  var recipient_last_name: js.UndefOr[String] = js.native
  var start_creation_date: js.UndefOr[String] = js.native
  var start_due_date: js.UndefOr[String] = js.native
  var start_invoice_date: js.UndefOr[String] = js.native
  var start_payment_date: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var total_count_required: js.UndefOr[Boolean] = js.native
  var upper_total_amount: js.UndefOr[Currency] = js.native
}

object SearchRequest {
  @scala.inline
  def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  @scala.inline
  implicit class SearchRequestOps[Self <: SearchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEnd_creation_date(value: String): Self = this.set("end_creation_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_creation_date: Self = this.set("end_creation_date", js.undefined)
    @scala.inline
    def setEnd_due_date(value: String): Self = this.set("end_due_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_due_date: Self = this.set("end_due_date", js.undefined)
    @scala.inline
    def setEnd_invoice_date(value: String): Self = this.set("end_invoice_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_invoice_date: Self = this.set("end_invoice_date", js.undefined)
    @scala.inline
    def setEnd_payment_date(value: String): Self = this.set("end_payment_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_payment_date: Self = this.set("end_payment_date", js.undefined)
    @scala.inline
    def setLower_total_amount(value: Currency): Self = this.set("lower_total_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLower_total_amount: Self = this.set("lower_total_amount", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_size: Self = this.set("page_size", js.undefined)
    @scala.inline
    def setRecipient_business_name(value: String): Self = this.set("recipient_business_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_business_name: Self = this.set("recipient_business_name", js.undefined)
    @scala.inline
    def setRecipient_first_name(value: String): Self = this.set("recipient_first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_first_name: Self = this.set("recipient_first_name", js.undefined)
    @scala.inline
    def setRecipient_last_name(value: String): Self = this.set("recipient_last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient_last_name: Self = this.set("recipient_last_name", js.undefined)
    @scala.inline
    def setStart_creation_date(value: String): Self = this.set("start_creation_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_creation_date: Self = this.set("start_creation_date", js.undefined)
    @scala.inline
    def setStart_due_date(value: String): Self = this.set("start_due_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_due_date: Self = this.set("start_due_date", js.undefined)
    @scala.inline
    def setStart_invoice_date(value: String): Self = this.set("start_invoice_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_invoice_date: Self = this.set("start_invoice_date", js.undefined)
    @scala.inline
    def setStart_payment_date(value: String): Self = this.set("start_payment_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_payment_date: Self = this.set("start_payment_date", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTotal_count_required(value: Boolean): Self = this.set("total_count_required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_count_required: Self = this.set("total_count_required", js.undefined)
    @scala.inline
    def setUpper_total_amount(value: Currency): Self = this.set("upper_total_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpper_total_amount: Self = this.set("upper_total_amount", js.undefined)
  }
  
}

