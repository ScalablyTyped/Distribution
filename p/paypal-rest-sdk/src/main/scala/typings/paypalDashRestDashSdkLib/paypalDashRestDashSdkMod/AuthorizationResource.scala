package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationResource extends Resource {
  val reference_id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("update_time")
  val update_time_AuthorizationResource: java.lang.String
  val valid_until: java.lang.String
}

object AuthorizationResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: java.lang.String,
    update_time: java.lang.String,
    valid_until: java.lang.String,
    create_time: java.lang.String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    links: js.Array[Link] = null,
    parent_payment: java.lang.String = null,
    payment_mode: java.lang.String = null,
    processor_response: js.Any = null,
    protection_eligibility: java.lang.String = null,
    protection_eligibility_type: java.lang.String = null,
    reason_code: java.lang.String = null,
    receipt_id: java.lang.String = null,
    reference_id: java.lang.String = null,
    state: java.lang.String = null
  ): AuthorizationResource = {
    val __obj = js.Dynamic.literal(amount = amount, id = id, update_time = update_time, valid_until = valid_until)
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
    __obj.asInstanceOf[AuthorizationResource]
  }
}

