package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

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
    val __obj = js.Dynamic.literal(amount = amount, id = id)
    if (capture_id != null) __obj.updateDynamic("capture_id")(capture_id)
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details)
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number)
    if (links != null) __obj.updateDynamic("links")(links)
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment)
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode)
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response)
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility)
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code)
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id)
    if (refund_funding_type != null) __obj.updateDynamic("refund_funding_type")(refund_funding_type)
    if (refund_reason_code != null) __obj.updateDynamic("refund_reason_code")(refund_reason_code)
    if (sale_id != null) __obj.updateDynamic("sale_id")(sale_id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[RefundResource]
  }
}

