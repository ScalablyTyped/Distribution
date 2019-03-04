package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var amount: Amount
  val create_time: js.UndefOr[java.lang.String] = js.undefined
  val fmf_details: js.UndefOr[FraudManagementFiltersDetails] = js.undefined
  val id: java.lang.String
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  val parent_payment: js.UndefOr[java.lang.String] = js.undefined
  val payment_mode: js.UndefOr[java.lang.String] = js.undefined
  val processor_response: js.UndefOr[js.Any] = js.undefined
  val protection_eligibility: js.UndefOr[java.lang.String] = js.undefined
  val protection_eligibility_type: js.UndefOr[java.lang.String] = js.undefined
  val reason_code: js.UndefOr[java.lang.String] = js.undefined
  val receipt_id: js.UndefOr[java.lang.String] = js.undefined
  val state: js.UndefOr[java.lang.String] = js.undefined
  val update_time: js.UndefOr[java.lang.String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    amount: Amount,
    id: java.lang.String,
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
    state: java.lang.String = null,
    update_time: java.lang.String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(amount = amount, id = id)
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
    if (state != null) __obj.updateDynamic("state")(state)
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[Resource]
  }
}

