package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice")
@js.native
object invoiceNs extends js.Object {
  trait BillingInfo extends Person {
    var additional_info: js.UndefOr[java.lang.String] = js.undefined
    var language: js.UndefOr[java.lang.String] = js.undefined
    var notification_channel: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Cost extends js.Object {
    var amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
    var percent: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait CustomAmount extends js.Object {
    var amount: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency
    var label: java.lang.String
  }
  
  trait Detail extends js.Object {
    var amount: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency
    var date: java.lang.String
    var note: js.UndefOr[java.lang.String] = js.undefined
    var transaction_id: java.lang.String
    var `type`: java.lang.String
  }
  
  trait EmailRequest extends js.Object {
    var cc_emails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var note: js.UndefOr[java.lang.String] = js.undefined
    var send_to_merchant: js.UndefOr[scala.Boolean] = js.undefined
    var send_to_payer: js.UndefOr[scala.Boolean] = js.undefined
    var subject: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait FileAttachment extends js.Object {
    var name: java.lang.String
    var url: java.lang.String
  }
  
  trait Invoice extends js.Object {
    var allow_partial_payment: js.UndefOr[scala.Boolean] = js.undefined
    var allow_tip: js.UndefOr[scala.Boolean] = js.undefined
    var attachments: js.UndefOr[js.Array[FileAttachment]] = js.undefined
    var billing_info: js.UndefOr[js.Array[BillingInfo]] = js.undefined
    var cc_info: js.UndefOr[js.Array[Participant]] = js.undefined
    var custom: js.UndefOr[CustomAmount] = js.undefined
    var discount: js.UndefOr[Cost] = js.undefined
    val id: js.UndefOr[java.lang.String] = js.undefined
    var invoice_date: js.UndefOr[java.lang.String] = js.undefined
    var items: js.UndefOr[js.Array[InvoiceItem]] = js.undefined
    val links: js.UndefOr[js.Array[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Link]] = js.undefined
    var logo_url: js.UndefOr[java.lang.String] = js.undefined
    var merchant_info: js.UndefOr[Merchant] = js.undefined
    var merchant_memo: js.UndefOr[java.lang.String] = js.undefined
    val metadata: js.UndefOr[paypalDashRestDashSdkLib.Anon_Createdby] = js.undefined
    var minimum_amount_due: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
    var note: js.UndefOr[java.lang.String] = js.undefined
    var number: js.UndefOr[java.lang.String] = js.undefined
    val paid_amount: js.UndefOr[paypalDashRestDashSdkLib.Anon_Paypal] = js.undefined
    val payment_summary: js.UndefOr[paypalDashRestDashSdkLib.Anon_Paypal] = js.undefined
    var payment_term: js.UndefOr[PaymentTerm] = js.undefined
    val payments: js.UndefOr[js.Array[PaymentDetail]] = js.undefined
    var phone: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone] = js.undefined
    var reference: js.UndefOr[java.lang.String] = js.undefined
    val refunded_amount: js.UndefOr[paypalDashRestDashSdkLib.Anon_Paypal] = js.undefined
    val refunds: js.UndefOr[js.Array[Detail]] = js.undefined
    var shipping_cost: js.UndefOr[ShippingCost] = js.undefined
    var shipping_info: js.UndefOr[paypalDashRestDashSdkLib.Anon_Firstname] = js.undefined
    val status: js.UndefOr[java.lang.String] = js.undefined
    var tax_calculated_after_discount: js.UndefOr[scala.Boolean] = js.undefined
    var tax_inclusive: js.UndefOr[scala.Boolean] = js.undefined
    var template_id: js.UndefOr[java.lang.String] = js.undefined
    var terms: js.UndefOr[java.lang.String] = js.undefined
    val total_amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
    val uri: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InvoiceItem extends js.Object {
    var date: js.UndefOr[java.lang.String] = js.undefined
    var description: js.UndefOr[java.lang.String] = js.undefined
    var discount: js.UndefOr[Cost] = js.undefined
    var name: java.lang.String
    var quantity: scala.Double
    var tax: js.UndefOr[Tax] = js.undefined
    var unit_of_measure: js.UndefOr[java.lang.String] = js.undefined
    var unit_price: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency
  }
  
  trait InvoiceResponse
    extends Invoice
       with paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response
  
  trait ListResponse
    extends paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Response {
    var invoices: js.Array[Invoice]
  }
  
  trait Merchant extends Person {
    var additional_info: js.UndefOr[java.lang.String] = js.undefined
    var additional_info_label: js.UndefOr[java.lang.String] = js.undefined
    var fax: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone] = js.undefined
    var tax_id: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait NumberResponse extends js.Object {
    var number: java.lang.String
  }
  
  trait Participant extends Person {
    var additional_info: js.UndefOr[java.lang.String] = js.undefined
    @JSName("email")
    var email_Participant: java.lang.String
    var fax: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone] = js.undefined
  }
  
  trait PayRequest extends js.Object {
    var amount: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency
    var date: java.lang.String
    var method: java.lang.String
    var note: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait PaymentDetail extends Detail {
    var method: java.lang.String
    var transaction_type: java.lang.String
  }
  
  trait PaymentTerm extends js.Object {
    var due_date: js.UndefOr[java.lang.String] = js.undefined
    var term_type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Person extends js.Object {
    var address: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Address] = js.undefined
    var business_name: js.UndefOr[java.lang.String] = js.undefined
    var email: js.UndefOr[java.lang.String] = js.undefined
    var first_name: js.UndefOr[java.lang.String] = js.undefined
    var last_name: js.UndefOr[java.lang.String] = js.undefined
    var phone: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Phone] = js.undefined
    var website: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait QrResponse extends js.Object {
    var image: java.lang.String
  }
  
  trait RefundRequest extends js.Object {
    var amount: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency
    var date: java.lang.String
    var note: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SearchRequest extends js.Object {
    var archived: js.UndefOr[scala.Boolean] = js.undefined
    var email: js.UndefOr[java.lang.String] = js.undefined
    var end_creation_date: js.UndefOr[java.lang.String] = js.undefined
    var end_due_date: js.UndefOr[java.lang.String] = js.undefined
    var end_invoice_date: js.UndefOr[java.lang.String] = js.undefined
    var end_payment_date: js.UndefOr[java.lang.String] = js.undefined
    var lower_total_amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
    var number: js.UndefOr[java.lang.String] = js.undefined
    var page: js.UndefOr[scala.Double] = js.undefined
    var page_size: js.UndefOr[scala.Double] = js.undefined
    var recipient_business_name: js.UndefOr[java.lang.String] = js.undefined
    var recipient_first_name: js.UndefOr[java.lang.String] = js.undefined
    var recipient_last_name: js.UndefOr[java.lang.String] = js.undefined
    var start_creation_date: js.UndefOr[java.lang.String] = js.undefined
    var start_due_date: js.UndefOr[java.lang.String] = js.undefined
    var start_invoice_date: js.UndefOr[java.lang.String] = js.undefined
    var start_payment_date: js.UndefOr[java.lang.String] = js.undefined
    var status: js.UndefOr[java.lang.String] = js.undefined
    var total_count_required: js.UndefOr[scala.Boolean] = js.undefined
    var upper_total_amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
  }
  
  trait ShippingCost extends js.Object {
    var amount: js.UndefOr[paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.Currency] = js.undefined
    var tax: js.UndefOr[Tax] = js.undefined
  }
  
  trait Tax extends Cost {
    var id: js.UndefOr[java.lang.String] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def cancel(id: java.lang.String, data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def cancel(id: java.lang.String, data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(id: java.lang.String, data: EmailRequest): scala.Unit = js.native
  def cancel(id: java.lang.String, data: EmailRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: EmailRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: EmailRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def cancel(
    id: java.lang.String,
    data: EmailRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def create(data: Invoice, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def create(
    data: Invoice,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def create(
    data: Invoice,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def create(
    data: Invoice,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def del(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def del(
    id: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def del(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def del(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalPayment(id: java.lang.String, trxid: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def deleteExternalPayment(
    id: java.lang.String,
    trxid: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalPayment(
    id: java.lang.String,
    trxid: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalPayment(
    id: java.lang.String,
    trxid: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalRefund(id: java.lang.String, trxid: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def deleteExternalRefund(
    id: java.lang.String,
    trxid: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalRefund(
    id: java.lang.String,
    trxid: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def deleteExternalRefund(
    id: java.lang.String,
    trxid: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def generateNumber(config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def generateNumber(
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[NumberResponse]
  ): scala.Unit = js.native
  def generateNumber(config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[NumberResponse]): scala.Unit = js.native
  def generateNumber(
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[NumberResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[NumberResponse]
  ): scala.Unit = js.native
  def get(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def list(data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def list(data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def list(
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.QueryParameters,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def qrCode(
    id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def qrCode(
    id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[QrResponse]
  ): scala.Unit = js.native
  def qrCode(
    id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[QrResponse]
  ): scala.Unit = js.native
  def qrCode(
    id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[QrResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[QrResponse]
  ): scala.Unit = js.native
  def recordPayment(id: java.lang.String, data: PayRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def recordPayment(
    id: java.lang.String,
    data: PayRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def recordPayment(
    id: java.lang.String,
    data: PayRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def recordPayment(
    id: java.lang.String,
    data: PayRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def recordRefund(id: java.lang.String, data: RefundRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def recordRefund(
    id: java.lang.String,
    data: RefundRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def recordRefund(
    id: java.lang.String,
    data: RefundRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def recordRefund(
    id: java.lang.String,
    data: RefundRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(id: java.lang.String, data: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def remind(id: java.lang.String, data: nodeLib.httpMod.RequestOptions, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: nodeLib.httpMod.RequestOptions,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(id: java.lang.String, data: EmailRequest): scala.Unit = js.native
  def remind(id: java.lang.String, data: EmailRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: EmailRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: EmailRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def remind(
    id: java.lang.String,
    data: EmailRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def search(data: SearchRequest, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def search(
    data: SearchRequest,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def search(
    data: SearchRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def search(
    data: SearchRequest,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def send(id: java.lang.String, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def send(
    id: java.lang.String,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def send(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse]
  ): scala.Unit = js.native
  def send(
    id: java.lang.String,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[ListResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[scala.Null]
  ): scala.Unit = js.native
  def update(id: java.lang.String, data: Invoice, config: nodeLib.httpMod.RequestOptions): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: Invoice,
    config: nodeLib.httpMod.RequestOptions,
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: Invoice,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: Invoice,
    config: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse],
    cb: paypalDashRestDashSdkLib.paypalDashRestDashSdkMod.CallbackFunction[InvoiceResponse]
  ): scala.Unit = js.native
}

