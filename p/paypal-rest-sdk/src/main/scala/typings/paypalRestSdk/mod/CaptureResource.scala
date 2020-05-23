package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureResource extends Resource {
  var invoice_number: js.UndefOr[String] = js.undefined
  var is_final_capture: js.UndefOr[Boolean] = js.undefined
  var transaction_fee: js.UndefOr[Currency] = js.undefined
}

object CaptureResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: String,
    create_time: String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    invoice_number: String = null,
    is_final_capture: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[Link] = null,
    parent_payment: String = null,
    payment_mode: String = null,
    processor_response: js.Any = null,
    protection_eligibility: String = null,
    protection_eligibility_type: String = null,
    reason_code: String = null,
    receipt_id: String = null,
    state: String = null,
    transaction_fee: Currency = null,
    update_time: String = null
  ): CaptureResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details.asInstanceOf[js.Any])
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number.asInstanceOf[js.Any])
    if (!js.isUndefined(is_final_capture)) __obj.updateDynamic("is_final_capture")(is_final_capture.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment.asInstanceOf[js.Any])
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode.asInstanceOf[js.Any])
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response.asInstanceOf[js.Any])
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility.asInstanceOf[js.Any])
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type.asInstanceOf[js.Any])
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code.asInstanceOf[js.Any])
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (transaction_fee != null) __obj.updateDynamic("transaction_fee")(transaction_fee.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResource]
  }
}

