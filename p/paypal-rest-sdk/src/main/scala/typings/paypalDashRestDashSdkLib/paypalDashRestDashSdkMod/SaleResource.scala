package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaleResource extends Resource {
  val billing_agreement_id: js.UndefOr[java.lang.String] = js.undefined
  val clearing_time: js.UndefOr[java.lang.String] = js.undefined
  val exchange_rate: js.UndefOr[java.lang.String] = js.undefined
  val payment_hold_reasons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val payment_hold_status: js.UndefOr[java.lang.String] = js.undefined
  val purchase_unit_reference_id: js.UndefOr[java.lang.String] = js.undefined
  val transaction_fee: js.UndefOr[Currency] = js.undefined
}

object SaleResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: java.lang.String,
    billing_agreement_id: java.lang.String = null,
    clearing_time: java.lang.String = null,
    create_time: java.lang.String = null,
    exchange_rate: java.lang.String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    links: js.Array[Link] = null,
    parent_payment: java.lang.String = null,
    payment_hold_reasons: js.Array[java.lang.String] = null,
    payment_hold_status: java.lang.String = null,
    payment_mode: java.lang.String = null,
    processor_response: js.Any = null,
    protection_eligibility: java.lang.String = null,
    protection_eligibility_type: java.lang.String = null,
    purchase_unit_reference_id: java.lang.String = null,
    reason_code: java.lang.String = null,
    receipt_id: java.lang.String = null,
    state: java.lang.String = null,
    transaction_fee: Currency = null,
    update_time: java.lang.String = null
  ): SaleResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("id")(id)
    if (billing_agreement_id != null) __obj.updateDynamic("billing_agreement_id")(billing_agreement_id)
    if (clearing_time != null) __obj.updateDynamic("clearing_time")(clearing_time)
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (exchange_rate != null) __obj.updateDynamic("exchange_rate")(exchange_rate)
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details)
    if (links != null) __obj.updateDynamic("links")(links)
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment)
    if (payment_hold_reasons != null) __obj.updateDynamic("payment_hold_reasons")(payment_hold_reasons)
    if (payment_hold_status != null) __obj.updateDynamic("payment_hold_status")(payment_hold_status)
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode)
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response)
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility)
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type)
    if (purchase_unit_reference_id != null) __obj.updateDynamic("purchase_unit_reference_id")(purchase_unit_reference_id)
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code)
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (transaction_fee != null) __obj.updateDynamic("transaction_fee")(transaction_fee)
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[SaleResource]
  }
}

