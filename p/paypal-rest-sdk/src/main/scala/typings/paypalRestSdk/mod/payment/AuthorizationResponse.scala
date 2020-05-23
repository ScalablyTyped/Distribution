package typings.paypalRestSdk.mod.payment

import typings.paypalRestSdk.mod.Amount
import typings.paypalRestSdk.mod.AuthorizationResource
import typings.paypalRestSdk.mod.FraudManagementFiltersDetails
import typings.paypalRestSdk.mod.Link
import typings.paypalRestSdk.mod.Response
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
    count: js.UndefOr[Double] = js.undefined,
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
    total_count: js.UndefOr[Double] = js.undefined
  ): AuthorizationResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
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
    if (reference_id != null) __obj.updateDynamic("reference_id")(reference_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponse]
  }
}

