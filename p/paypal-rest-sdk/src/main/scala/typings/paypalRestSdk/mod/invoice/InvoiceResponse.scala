package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.anon.Address
import typings.paypalRestSdk.anon.Cancelledby
import typings.paypalRestSdk.anon.Other
import typings.paypalRestSdk.mod.Currency
import typings.paypalRestSdk.mod.Link
import typings.paypalRestSdk.mod.Phone
import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceResponse
  extends Invoice
     with Response

object InvoiceResponse {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    allow_partial_payment: js.UndefOr[Boolean] = js.undefined,
    allow_tip: js.UndefOr[Boolean] = js.undefined,
    attachments: js.Array[FileAttachment] = null,
    billing_info: js.Array[BillingInfo] = null,
    cc_info: js.Array[Participant] = null,
    count: js.UndefOr[Double] = js.undefined,
    create_time: String = null,
    custom: CustomAmount = null,
    discount: Cost = null,
    id: String = null,
    invoice_date: String = null,
    items: js.Array[InvoiceItem] = null,
    links: js.Array[Link] = null,
    logo_url: String = null,
    merchant_info: Merchant = null,
    merchant_memo: String = null,
    metadata: Cancelledby = null,
    minimum_amount_due: Currency = null,
    note: String = null,
    number: String = null,
    paid_amount: Other = null,
    payment_summary: Other = null,
    payment_term: PaymentTerm = null,
    payments: js.Array[PaymentDetail] = null,
    phone: Phone = null,
    reference: String = null,
    refunded_amount: Other = null,
    refunds: js.Array[Detail] = null,
    shipping_cost: ShippingCost = null,
    shipping_info: Address = null,
    status: String = null,
    tax_calculated_after_discount: js.UndefOr[Boolean] = js.undefined,
    tax_inclusive: js.UndefOr[Boolean] = js.undefined,
    template_id: String = null,
    terms: String = null,
    total_amount: Currency = null,
    total_count: js.UndefOr[Double] = js.undefined,
    uri: String = null
  ): InvoiceResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_partial_payment)) __obj.updateDynamic("allow_partial_payment")(allow_partial_payment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_tip)) __obj.updateDynamic("allow_tip")(allow_tip.get.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (billing_info != null) __obj.updateDynamic("billing_info")(billing_info.asInstanceOf[js.Any])
    if (cc_info != null) __obj.updateDynamic("cc_info")(cc_info.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (discount != null) __obj.updateDynamic("discount")(discount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invoice_date != null) __obj.updateDynamic("invoice_date")(invoice_date.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo_url != null) __obj.updateDynamic("logo_url")(logo_url.asInstanceOf[js.Any])
    if (merchant_info != null) __obj.updateDynamic("merchant_info")(merchant_info.asInstanceOf[js.Any])
    if (merchant_memo != null) __obj.updateDynamic("merchant_memo")(merchant_memo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minimum_amount_due != null) __obj.updateDynamic("minimum_amount_due")(minimum_amount_due.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (paid_amount != null) __obj.updateDynamic("paid_amount")(paid_amount.asInstanceOf[js.Any])
    if (payment_summary != null) __obj.updateDynamic("payment_summary")(payment_summary.asInstanceOf[js.Any])
    if (payment_term != null) __obj.updateDynamic("payment_term")(payment_term.asInstanceOf[js.Any])
    if (payments != null) __obj.updateDynamic("payments")(payments.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (refunded_amount != null) __obj.updateDynamic("refunded_amount")(refunded_amount.asInstanceOf[js.Any])
    if (refunds != null) __obj.updateDynamic("refunds")(refunds.asInstanceOf[js.Any])
    if (shipping_cost != null) __obj.updateDynamic("shipping_cost")(shipping_cost.asInstanceOf[js.Any])
    if (shipping_info != null) __obj.updateDynamic("shipping_info")(shipping_info.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_calculated_after_discount)) __obj.updateDynamic("tax_calculated_after_discount")(tax_calculated_after_discount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_inclusive)) __obj.updateDynamic("tax_inclusive")(tax_inclusive.get.asInstanceOf[js.Any])
    if (template_id != null) __obj.updateDynamic("template_id")(template_id.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (total_amount != null) __obj.updateDynamic("total_amount")(total_amount.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceResponse]
  }
}

