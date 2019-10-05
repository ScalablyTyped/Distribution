package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Amount
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.AuthorizationResource
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.FraudManagementFiltersDetails
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Link
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationResponse
  extends AuthorizationResource
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.undefined
}

object AuthorizationResponse {
  @scala.inline
  def apply(
    amount: Amount,
    httpStatusCode: Double,
    id: String,
    update_time: String,
    valid_until: String,
    count: Int | Double = null,
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
    reference_id: String = null,
    state: String = null,
    total_count: Int | Double = null
  ): AuthorizationResponse = {
    val __obj = js.Dynamic.literal(amount = amount, httpStatusCode = httpStatusCode, id = id, update_time = update_time, valid_until = valid_until)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details)
    if (links != null) __obj.updateDynamic("links")(links)
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment)
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode)
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response)
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility)
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type)
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code)
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id)
    if (reference_id != null) __obj.updateDynamic("reference_id")(reference_id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponse]
  }
}

