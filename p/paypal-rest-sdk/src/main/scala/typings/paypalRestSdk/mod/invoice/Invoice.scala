package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.anon.Address
import typings.paypalRestSdk.anon.Cancelledby
import typings.paypalRestSdk.anon.Other
import typings.paypalRestSdk.mod.Currency
import typings.paypalRestSdk.mod.Link
import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoice extends js.Object {
  var allow_partial_payment: js.UndefOr[Boolean] = js.native
  var allow_tip: js.UndefOr[Boolean] = js.native
  var attachments: js.UndefOr[js.Array[FileAttachment]] = js.native
  var billing_info: js.UndefOr[js.Array[BillingInfo]] = js.native
  var cc_info: js.UndefOr[js.Array[Participant]] = js.native
  var custom: js.UndefOr[CustomAmount] = js.native
  var discount: js.UndefOr[Cost] = js.native
  val id: js.UndefOr[String] = js.native
  var invoice_date: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[InvoiceItem]] = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  var logo_url: js.UndefOr[String] = js.native
  var merchant_info: js.UndefOr[Merchant] = js.native
  var merchant_memo: js.UndefOr[String] = js.native
  val metadata: js.UndefOr[Cancelledby] = js.native
  var minimum_amount_due: js.UndefOr[Currency] = js.native
  var note: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  val paid_amount: js.UndefOr[Other] = js.native
  val payment_summary: js.UndefOr[Other] = js.native
  var payment_term: js.UndefOr[PaymentTerm] = js.native
  val payments: js.UndefOr[js.Array[PaymentDetail]] = js.native
  var phone: js.UndefOr[Phone] = js.native
  var reference: js.UndefOr[String] = js.native
  val refunded_amount: js.UndefOr[Other] = js.native
  val refunds: js.UndefOr[js.Array[Detail]] = js.native
  var shipping_cost: js.UndefOr[ShippingCost] = js.native
  var shipping_info: js.UndefOr[Address] = js.native
  val status: js.UndefOr[String] = js.native
  var tax_calculated_after_discount: js.UndefOr[Boolean] = js.native
  var tax_inclusive: js.UndefOr[Boolean] = js.native
  var template_id: js.UndefOr[String] = js.native
  var terms: js.UndefOr[String] = js.native
  val total_amount: js.UndefOr[Currency] = js.native
  val uri: js.UndefOr[String] = js.native
}

object Invoice {
  @scala.inline
  def apply(): Invoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoice]
  }
  @scala.inline
  implicit class InvoiceOps[Self <: Invoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_partial_payment(value: Boolean): Self = this.set("allow_partial_payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_partial_payment: Self = this.set("allow_partial_payment", js.undefined)
    @scala.inline
    def setAllow_tip(value: Boolean): Self = this.set("allow_tip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_tip: Self = this.set("allow_tip", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: FileAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[FileAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBilling_infoVarargs(value: BillingInfo*): Self = this.set("billing_info", js.Array(value :_*))
    @scala.inline
    def setBilling_info(value: js.Array[BillingInfo]): Self = this.set("billing_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_info: Self = this.set("billing_info", js.undefined)
    @scala.inline
    def setCc_infoVarargs(value: Participant*): Self = this.set("cc_info", js.Array(value :_*))
    @scala.inline
    def setCc_info(value: js.Array[Participant]): Self = this.set("cc_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc_info: Self = this.set("cc_info", js.undefined)
    @scala.inline
    def setCustom(value: CustomAmount): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDiscount(value: Cost): Self = this.set("discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvoice_date(value: String): Self = this.set("invoice_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_date: Self = this.set("invoice_date", js.undefined)
    @scala.inline
    def setItemsVarargs(value: InvoiceItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[InvoiceItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setLogo_url(value: String): Self = this.set("logo_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo_url: Self = this.set("logo_url", js.undefined)
    @scala.inline
    def setMerchant_info(value: Merchant): Self = this.set("merchant_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchant_info: Self = this.set("merchant_info", js.undefined)
    @scala.inline
    def setMerchant_memo(value: String): Self = this.set("merchant_memo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchant_memo: Self = this.set("merchant_memo", js.undefined)
    @scala.inline
    def setMetadata(value: Cancelledby): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMinimum_amount_due(value: Currency): Self = this.set("minimum_amount_due", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum_amount_due: Self = this.set("minimum_amount_due", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPaid_amount(value: Other): Self = this.set("paid_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaid_amount: Self = this.set("paid_amount", js.undefined)
    @scala.inline
    def setPayment_summary(value: Other): Self = this.set("payment_summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_summary: Self = this.set("payment_summary", js.undefined)
    @scala.inline
    def setPayment_term(value: PaymentTerm): Self = this.set("payment_term", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_term: Self = this.set("payment_term", js.undefined)
    @scala.inline
    def setPaymentsVarargs(value: PaymentDetail*): Self = this.set("payments", js.Array(value :_*))
    @scala.inline
    def setPayments(value: js.Array[PaymentDetail]): Self = this.set("payments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayments: Self = this.set("payments", js.undefined)
    @scala.inline
    def setPhone(value: Phone): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRefunded_amount(value: Other): Self = this.set("refunded_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefunded_amount: Self = this.set("refunded_amount", js.undefined)
    @scala.inline
    def setRefundsVarargs(value: Detail*): Self = this.set("refunds", js.Array(value :_*))
    @scala.inline
    def setRefunds(value: js.Array[Detail]): Self = this.set("refunds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefunds: Self = this.set("refunds", js.undefined)
    @scala.inline
    def setShipping_cost(value: ShippingCost): Self = this.set("shipping_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_cost: Self = this.set("shipping_cost", js.undefined)
    @scala.inline
    def setShipping_info(value: Address): Self = this.set("shipping_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_info: Self = this.set("shipping_info", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTax_calculated_after_discount(value: Boolean): Self = this.set("tax_calculated_after_discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_calculated_after_discount: Self = this.set("tax_calculated_after_discount", js.undefined)
    @scala.inline
    def setTax_inclusive(value: Boolean): Self = this.set("tax_inclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_inclusive: Self = this.set("tax_inclusive", js.undefined)
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate_id: Self = this.set("template_id", js.undefined)
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    @scala.inline
    def setTotal_amount(value: Currency): Self = this.set("total_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_amount: Self = this.set("total_amount", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

