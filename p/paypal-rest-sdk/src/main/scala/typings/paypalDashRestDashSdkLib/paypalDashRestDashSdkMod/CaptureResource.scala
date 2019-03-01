package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureResource extends Resource {
  var invoice_number: js.UndefOr[java.lang.String] = js.undefined
  var is_final_capture: js.UndefOr[scala.Boolean] = js.undefined
  var transaction_fee: js.UndefOr[Currency] = js.undefined
}

object CaptureResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: java.lang.String,
    create_time: java.lang.String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    invoice_number: java.lang.String = null,
    is_final_capture: js.UndefOr[scala.Boolean] = js.undefined,
    links: js.Array[Link] = null,
    parent_payment: java.lang.String = null,
    payment_mode: java.lang.String = null,
    processor_response: js.Any = null,
    protection_eligibility: java.lang.String = null,
    protection_eligibility_type: java.lang.String = null,
    reason_code: java.lang.String = null,
    receipt_id: java.lang.String = null,
    state: java.lang.String = null,
    transaction_fee: Currency = null,
    update_time: java.lang.String = null
  ): CaptureResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("id")(id)
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details)
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number)
    if (!js.isUndefined(is_final_capture)) __obj.updateDynamic("is_final_capture")(is_final_capture)
    if (links != null) __obj.updateDynamic("links")(links)
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment)
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode)
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response)
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility)
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type)
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code)
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (transaction_fee != null) __obj.updateDynamic("transaction_fee")(transaction_fee)
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[CaptureResource]
  }
}

