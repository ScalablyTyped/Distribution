package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.anon.Address
import typings.paypalRestSdk.anon.Cancelledby
import typings.paypalRestSdk.anon.Other
import typings.paypalRestSdk.mod.Currency
import typings.paypalRestSdk.mod.Link
import typings.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invoice extends StObject {
  
  var allow_partial_payment: js.UndefOr[Boolean] = js.undefined
  
  var allow_tip: js.UndefOr[Boolean] = js.undefined
  
  var attachments: js.UndefOr[js.Array[FileAttachment]] = js.undefined
  
  var billing_info: js.UndefOr[js.Array[BillingInfo]] = js.undefined
  
  var cc_info: js.UndefOr[js.Array[Participant]] = js.undefined
  
  var custom: js.UndefOr[CustomAmount] = js.undefined
  
  var discount: js.UndefOr[Cost] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  var invoice_date: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[InvoiceItem]] = js.undefined
  
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  
  var logo_url: js.UndefOr[String] = js.undefined
  
  var merchant_info: js.UndefOr[Merchant] = js.undefined
  
  var merchant_memo: js.UndefOr[String] = js.undefined
  
  val metadata: js.UndefOr[Cancelledby] = js.undefined
  
  var minimum_amount_due: js.UndefOr[Currency] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  val paid_amount: js.UndefOr[Other] = js.undefined
  
  val payment_summary: js.UndefOr[Other] = js.undefined
  
  var payment_term: js.UndefOr[PaymentTerm] = js.undefined
  
  val payments: js.UndefOr[js.Array[PaymentDetail]] = js.undefined
  
  var phone: js.UndefOr[Phone] = js.undefined
  
  var reference: js.UndefOr[String] = js.undefined
  
  val refunded_amount: js.UndefOr[Other] = js.undefined
  
  val refunds: js.UndefOr[js.Array[Detail]] = js.undefined
  
  var shipping_cost: js.UndefOr[ShippingCost] = js.undefined
  
  var shipping_info: js.UndefOr[Address] = js.undefined
  
  val status: js.UndefOr[String] = js.undefined
  
  var tax_calculated_after_discount: js.UndefOr[Boolean] = js.undefined
  
  var tax_inclusive: js.UndefOr[Boolean] = js.undefined
  
  var template_id: js.UndefOr[String] = js.undefined
  
  var terms: js.UndefOr[String] = js.undefined
  
  val total_amount: js.UndefOr[Currency] = js.undefined
  
  val uri: js.UndefOr[String] = js.undefined
}
object Invoice {
  
  inline def apply(): Invoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoice]
  }
  
  extension [Self <: Invoice](x: Self) {
    
    inline def setAllow_partial_payment(value: Boolean): Self = StObject.set(x, "allow_partial_payment", value.asInstanceOf[js.Any])
    
    inline def setAllow_partial_paymentUndefined: Self = StObject.set(x, "allow_partial_payment", js.undefined)
    
    inline def setAllow_tip(value: Boolean): Self = StObject.set(x, "allow_tip", value.asInstanceOf[js.Any])
    
    inline def setAllow_tipUndefined: Self = StObject.set(x, "allow_tip", js.undefined)
    
    inline def setAttachments(value: js.Array[FileAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: FileAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBilling_info(value: js.Array[BillingInfo]): Self = StObject.set(x, "billing_info", value.asInstanceOf[js.Any])
    
    inline def setBilling_infoUndefined: Self = StObject.set(x, "billing_info", js.undefined)
    
    inline def setBilling_infoVarargs(value: BillingInfo*): Self = StObject.set(x, "billing_info", js.Array(value*))
    
    inline def setCc_info(value: js.Array[Participant]): Self = StObject.set(x, "cc_info", value.asInstanceOf[js.Any])
    
    inline def setCc_infoUndefined: Self = StObject.set(x, "cc_info", js.undefined)
    
    inline def setCc_infoVarargs(value: Participant*): Self = StObject.set(x, "cc_info", js.Array(value*))
    
    inline def setCustom(value: CustomAmount): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDiscount(value: Cost): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInvoice_date(value: String): Self = StObject.set(x, "invoice_date", value.asInstanceOf[js.Any])
    
    inline def setInvoice_dateUndefined: Self = StObject.set(x, "invoice_date", js.undefined)
    
    inline def setItems(value: js.Array[InvoiceItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InvoiceItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    inline def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
    
    inline def setMerchant_info(value: Merchant): Self = StObject.set(x, "merchant_info", value.asInstanceOf[js.Any])
    
    inline def setMerchant_infoUndefined: Self = StObject.set(x, "merchant_info", js.undefined)
    
    inline def setMerchant_memo(value: String): Self = StObject.set(x, "merchant_memo", value.asInstanceOf[js.Any])
    
    inline def setMerchant_memoUndefined: Self = StObject.set(x, "merchant_memo", js.undefined)
    
    inline def setMetadata(value: Cancelledby): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinimum_amount_due(value: Currency): Self = StObject.set(x, "minimum_amount_due", value.asInstanceOf[js.Any])
    
    inline def setMinimum_amount_dueUndefined: Self = StObject.set(x, "minimum_amount_due", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPaid_amount(value: Other): Self = StObject.set(x, "paid_amount", value.asInstanceOf[js.Any])
    
    inline def setPaid_amountUndefined: Self = StObject.set(x, "paid_amount", js.undefined)
    
    inline def setPayment_summary(value: Other): Self = StObject.set(x, "payment_summary", value.asInstanceOf[js.Any])
    
    inline def setPayment_summaryUndefined: Self = StObject.set(x, "payment_summary", js.undefined)
    
    inline def setPayment_term(value: PaymentTerm): Self = StObject.set(x, "payment_term", value.asInstanceOf[js.Any])
    
    inline def setPayment_termUndefined: Self = StObject.set(x, "payment_term", js.undefined)
    
    inline def setPayments(value: js.Array[PaymentDetail]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: PaymentDetail*): Self = StObject.set(x, "payments", js.Array(value*))
    
    inline def setPhone(value: Phone): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRefunded_amount(value: Other): Self = StObject.set(x, "refunded_amount", value.asInstanceOf[js.Any])
    
    inline def setRefunded_amountUndefined: Self = StObject.set(x, "refunded_amount", js.undefined)
    
    inline def setRefunds(value: js.Array[Detail]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setRefundsVarargs(value: Detail*): Self = StObject.set(x, "refunds", js.Array(value*))
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costUndefined: Self = StObject.set(x, "shipping_cost", js.undefined)
    
    inline def setShipping_info(value: Address): Self = StObject.set(x, "shipping_info", value.asInstanceOf[js.Any])
    
    inline def setShipping_infoUndefined: Self = StObject.set(x, "shipping_info", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTax_calculated_after_discount(value: Boolean): Self = StObject.set(x, "tax_calculated_after_discount", value.asInstanceOf[js.Any])
    
    inline def setTax_calculated_after_discountUndefined: Self = StObject.set(x, "tax_calculated_after_discount", js.undefined)
    
    inline def setTax_inclusive(value: Boolean): Self = StObject.set(x, "tax_inclusive", value.asInstanceOf[js.Any])
    
    inline def setTax_inclusiveUndefined: Self = StObject.set(x, "tax_inclusive", js.undefined)
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTotal_amount(value: Currency): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
    
    inline def setTotal_amountUndefined: Self = StObject.set(x, "total_amount", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
