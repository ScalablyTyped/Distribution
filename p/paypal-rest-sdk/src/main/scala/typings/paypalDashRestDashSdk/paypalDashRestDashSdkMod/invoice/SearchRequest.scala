package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchRequest extends js.Object {
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
  def apply(
    archived: js.UndefOr[Boolean] = js.undefined,
    email: String = null,
    end_creation_date: String = null,
    end_due_date: String = null,
    end_invoice_date: String = null,
    end_payment_date: String = null,
    lower_total_amount: Currency = null,
    number: String = null,
    page: Int | Double = null,
    page_size: Int | Double = null,
    recipient_business_name: String = null,
    recipient_first_name: String = null,
    recipient_last_name: String = null,
    start_creation_date: String = null,
    start_due_date: String = null,
    start_invoice_date: String = null,
    start_payment_date: String = null,
    status: String = null,
    total_count_required: js.UndefOr[Boolean] = js.undefined,
    upper_total_amount: Currency = null
  ): SearchRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (end_creation_date != null) __obj.updateDynamic("end_creation_date")(end_creation_date.asInstanceOf[js.Any])
    if (end_due_date != null) __obj.updateDynamic("end_due_date")(end_due_date.asInstanceOf[js.Any])
    if (end_invoice_date != null) __obj.updateDynamic("end_invoice_date")(end_invoice_date.asInstanceOf[js.Any])
    if (end_payment_date != null) __obj.updateDynamic("end_payment_date")(end_payment_date.asInstanceOf[js.Any])
    if (lower_total_amount != null) __obj.updateDynamic("lower_total_amount")(lower_total_amount.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (recipient_business_name != null) __obj.updateDynamic("recipient_business_name")(recipient_business_name.asInstanceOf[js.Any])
    if (recipient_first_name != null) __obj.updateDynamic("recipient_first_name")(recipient_first_name.asInstanceOf[js.Any])
    if (recipient_last_name != null) __obj.updateDynamic("recipient_last_name")(recipient_last_name.asInstanceOf[js.Any])
    if (start_creation_date != null) __obj.updateDynamic("start_creation_date")(start_creation_date.asInstanceOf[js.Any])
    if (start_due_date != null) __obj.updateDynamic("start_due_date")(start_due_date.asInstanceOf[js.Any])
    if (start_invoice_date != null) __obj.updateDynamic("start_invoice_date")(start_invoice_date.asInstanceOf[js.Any])
    if (start_payment_date != null) __obj.updateDynamic("start_payment_date")(start_payment_date.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count_required)) __obj.updateDynamic("total_count_required")(total_count_required.asInstanceOf[js.Any])
    if (upper_total_amount != null) __obj.updateDynamic("upper_total_amount")(upper_total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRequest]
  }
}

