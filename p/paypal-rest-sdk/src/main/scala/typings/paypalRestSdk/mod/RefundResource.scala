package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundResource extends Resource {
  val capture_id: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var invoice_number: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  val refund_funding_type: js.UndefOr[String] = js.undefined
  val refund_reason_code: js.UndefOr[String] = js.undefined
  val sale_id: js.UndefOr[String] = js.undefined
}

object RefundResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: String,
    capture_id: String = null,
    create_time: String = null,
    description: String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    invoice_number: String = null,
    links: js.Array[Link] = null,
    parent_payment: String = null,
    payment_mode: String = null,
    processor_response: js.Any = null,
    protection_eligibility: String = null,
    protection_eligibility_type: String = null,
    reason: String = null,
    reason_code: String = null,
    receipt_id: String = null,
    refund_funding_type: String = null,
    refund_reason_code: String = null,
    sale_id: String = null,
    state: String = null,
    update_time: String = null
  ): RefundResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (capture_id != null) __obj.updateDynamic("capture_id")(capture_id.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details.asInstanceOf[js.Any])
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment.asInstanceOf[js.Any])
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode.asInstanceOf[js.Any])
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response.asInstanceOf[js.Any])
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility.asInstanceOf[js.Any])
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code.asInstanceOf[js.Any])
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id.asInstanceOf[js.Any])
    if (refund_funding_type != null) __obj.updateDynamic("refund_funding_type")(refund_funding_type.asInstanceOf[js.Any])
    if (refund_reason_code != null) __obj.updateDynamic("refund_reason_code")(refund_reason_code.asInstanceOf[js.Any])
    if (sale_id != null) __obj.updateDynamic("sale_id")(sale_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundResource]
  }
}

