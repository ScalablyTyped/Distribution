package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaleResource extends Resource {
  val billing_agreement_id: js.UndefOr[String] = js.undefined
  val clearing_time: js.UndefOr[String] = js.undefined
  val exchange_rate: js.UndefOr[String] = js.undefined
  val payment_hold_reasons: js.UndefOr[js.Array[String]] = js.undefined
  val payment_hold_status: js.UndefOr[String] = js.undefined
  val purchase_unit_reference_id: js.UndefOr[String] = js.undefined
  val transaction_fee: js.UndefOr[Currency] = js.undefined
}

object SaleResource {
  @scala.inline
  def apply(
    amount: Amount,
    id: String,
    billing_agreement_id: String = null,
    clearing_time: String = null,
    create_time: String = null,
    exchange_rate: String = null,
    fmf_details: FraudManagementFiltersDetails = null,
    links: js.Array[Link] = null,
    parent_payment: String = null,
    payment_hold_reasons: js.Array[String] = null,
    payment_hold_status: String = null,
    payment_mode: String = null,
    processor_response: js.Any = null,
    protection_eligibility: String = null,
    protection_eligibility_type: String = null,
    purchase_unit_reference_id: String = null,
    reason_code: String = null,
    receipt_id: String = null,
    state: String = null,
    transaction_fee: Currency = null,
    update_time: String = null
  ): SaleResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (billing_agreement_id != null) __obj.updateDynamic("billing_agreement_id")(billing_agreement_id.asInstanceOf[js.Any])
    if (clearing_time != null) __obj.updateDynamic("clearing_time")(clearing_time.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (exchange_rate != null) __obj.updateDynamic("exchange_rate")(exchange_rate.asInstanceOf[js.Any])
    if (fmf_details != null) __obj.updateDynamic("fmf_details")(fmf_details.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (parent_payment != null) __obj.updateDynamic("parent_payment")(parent_payment.asInstanceOf[js.Any])
    if (payment_hold_reasons != null) __obj.updateDynamic("payment_hold_reasons")(payment_hold_reasons.asInstanceOf[js.Any])
    if (payment_hold_status != null) __obj.updateDynamic("payment_hold_status")(payment_hold_status.asInstanceOf[js.Any])
    if (payment_mode != null) __obj.updateDynamic("payment_mode")(payment_mode.asInstanceOf[js.Any])
    if (processor_response != null) __obj.updateDynamic("processor_response")(processor_response.asInstanceOf[js.Any])
    if (protection_eligibility != null) __obj.updateDynamic("protection_eligibility")(protection_eligibility.asInstanceOf[js.Any])
    if (protection_eligibility_type != null) __obj.updateDynamic("protection_eligibility_type")(protection_eligibility_type.asInstanceOf[js.Any])
    if (purchase_unit_reference_id != null) __obj.updateDynamic("purchase_unit_reference_id")(purchase_unit_reference_id.asInstanceOf[js.Any])
    if (reason_code != null) __obj.updateDynamic("reason_code")(reason_code.asInstanceOf[js.Any])
    if (receipt_id != null) __obj.updateDynamic("receipt_id")(receipt_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (transaction_fee != null) __obj.updateDynamic("transaction_fee")(transaction_fee.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResource]
  }
}

