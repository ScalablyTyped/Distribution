package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
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
  @scala.inline
  def apply(
    amount: Amount,
    id: String,
    create_time: String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    links: js.Array[Link] = null,
    parent_payment: String = null,
    payment_mode: String = null,
    processor_response: js.Any = null,
    protection_eligibility: String = null,
    protection_eligibility_type: String = null,
    reason_code: String = null,
    receipt_id: String = null,
    state: String = null,
    update_time: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment.asInstanceOf[js.Any])
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode.asInstanceOf[js.Any])
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response.asInstanceOf[js.Any])
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility.asInstanceOf[js.Any])
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type.asInstanceOf[js.Any])
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code.asInstanceOf[js.Any])
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

