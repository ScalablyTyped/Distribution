package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.Anon_Address
import typings.paypalDashRestDashSdk.Anon_Cancelledby
import typings.paypalDashRestDashSdk.Anon_Other
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.BillingInfo
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Cost
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.CustomAmount
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Detail
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.EmailRequest
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.FileAttachment
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Invoice
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.InvoiceItem
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.InvoiceResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.ListResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Merchant
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.NumberResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Participant
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.PayRequest
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.PaymentDetail
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.PaymentTerm
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Person
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.QrResponse
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.SearchRequest
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.ShippingCost
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.Tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice")
@js.native
object invoiceNs extends js.Object {
  trait BillingInfo extends Person {
    var additional_info: js.UndefOr[String] = js.undefined
    var language: js.UndefOr[String] = js.undefined
    var notification_channel: js.UndefOr[String] = js.undefined
  }
  
  trait Cost extends js.Object {
    var amount: js.UndefOr[Currency] = js.undefined
    var percent: js.UndefOr[Double] = js.undefined
  }
  
  trait CustomAmount extends js.Object {
    var amount: Currency
    var label: String
  }
  
  trait Detail extends js.Object {
    var amount: Currency
    var date: String
    var note: js.UndefOr[String] = js.undefined
    var transaction_id: String
    var `type`: String
  }
  
  trait EmailRequest extends js.Object {
    var cc_emails: js.UndefOr[js.Array[String]] = js.undefined
    var note: js.UndefOr[String] = js.undefined
    var send_to_merchant: js.UndefOr[Boolean] = js.undefined
    var send_to_payer: js.UndefOr[Boolean] = js.undefined
    var subject: js.UndefOr[String] = js.undefined
  }
  
  trait FileAttachment extends js.Object {
    var name: String
    var url: String
  }
  
  trait Invoice extends js.Object {
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
    val metadata: js.UndefOr[Anon_Cancelledby] = js.undefined
    var minimum_amount_due: js.UndefOr[Currency] = js.undefined
    var note: js.UndefOr[String] = js.undefined
    var number: js.UndefOr[String] = js.undefined
    val paid_amount: js.UndefOr[Anon_Other] = js.undefined
    val payment_summary: js.UndefOr[Anon_Other] = js.undefined
    var payment_term: js.UndefOr[PaymentTerm] = js.undefined
    val payments: js.UndefOr[js.Array[PaymentDetail]] = js.undefined
    var phone: js.UndefOr[Phone] = js.undefined
    var reference: js.UndefOr[String] = js.undefined
    val refunded_amount: js.UndefOr[Anon_Other] = js.undefined
    val refunds: js.UndefOr[js.Array[Detail]] = js.undefined
    var shipping_cost: js.UndefOr[ShippingCost] = js.undefined
    var shipping_info: js.UndefOr[Anon_Address] = js.undefined
    val status: js.UndefOr[String] = js.undefined
    var tax_calculated_after_discount: js.UndefOr[Boolean] = js.undefined
    var tax_inclusive: js.UndefOr[Boolean] = js.undefined
    var template_id: js.UndefOr[String] = js.undefined
    var terms: js.UndefOr[String] = js.undefined
    val total_amount: js.UndefOr[Currency] = js.undefined
    val uri: js.UndefOr[String] = js.undefined
  }
  
  trait InvoiceItem extends js.Object {
    var date: js.UndefOr[String] = js.undefined
    var description: js.UndefOr[String] = js.undefined
    var discount: js.UndefOr[Cost] = js.undefined
    var name: String
    var quantity: Double
    var tax: js.UndefOr[Tax] = js.undefined
    var unit_of_measure: js.UndefOr[String] = js.undefined
    var unit_price: Currency
  }
  
  trait InvoiceResponse
    extends Invoice
       with Response
  
  trait ListResponse extends Response {
    var invoices: js.Array[Invoice]
  }
  
  trait Merchant extends Person {
    var additional_info: js.UndefOr[String] = js.undefined
    var additional_info_label: js.UndefOr[String] = js.undefined
    var fax: js.UndefOr[Phone] = js.undefined
    var tax_id: js.UndefOr[String] = js.undefined
  }
  
  trait NumberResponse extends js.Object {
    var number: String
  }
  
  trait Participant extends Person {
    var additional_info: js.UndefOr[String] = js.undefined
    @JSName("email")
    var email_Participant: String
    var fax: js.UndefOr[Phone] = js.undefined
  }
  
  trait PayRequest extends js.Object {
    var amount: Currency
    var date: String
    var method: String
    var note: js.UndefOr[String] = js.undefined
  }
  
  trait PaymentDetail extends Detail {
    var method: String
    var transaction_type: String
  }
  
  trait PaymentTerm extends js.Object {
    var due_date: js.UndefOr[String] = js.undefined
    var term_type: js.UndefOr[String] = js.undefined
  }
  
  trait Person extends js.Object {
    var address: js.UndefOr[Address] = js.undefined
    var business_name: js.UndefOr[String] = js.undefined
    var email: js.UndefOr[String] = js.undefined
    var first_name: js.UndefOr[String] = js.undefined
    var last_name: js.UndefOr[String] = js.undefined
    var phone: js.UndefOr[Phone] = js.undefined
    var website: js.UndefOr[String] = js.undefined
  }
  
  trait QrResponse extends js.Object {
    var image: String
  }
  
  trait RefundRequest extends js.Object {
    var amount: Currency
    var date: String
    var note: js.UndefOr[String] = js.undefined
  }
  
  trait SearchRequest extends js.Object {
    var archived: js.UndefOr[Boolean] = js.undefined
    var email: js.UndefOr[String] = js.undefined
    var end_creation_date: js.UndefOr[String] = js.undefined
    var end_due_date: js.UndefOr[String] = js.undefined
    var end_invoice_date: js.UndefOr[String] = js.undefined
    var end_payment_date: js.UndefOr[String] = js.undefined
    var lower_total_amount: js.UndefOr[Currency] = js.undefined
    var number: js.UndefOr[String] = js.undefined
    var page: js.UndefOr[Double] = js.undefined
    var page_size: js.UndefOr[Double] = js.undefined
    var recipient_business_name: js.UndefOr[String] = js.undefined
    var recipient_first_name: js.UndefOr[String] = js.undefined
    var recipient_last_name: js.UndefOr[String] = js.undefined
    var start_creation_date: js.UndefOr[String] = js.undefined
    var start_due_date: js.UndefOr[String] = js.undefined
    var start_invoice_date: js.UndefOr[String] = js.undefined
    var start_payment_date: js.UndefOr[String] = js.undefined
    var status: js.UndefOr[String] = js.undefined
    var total_count_required: js.UndefOr[Boolean] = js.undefined
    var upper_total_amount: js.UndefOr[Currency] = js.undefined
  }
  
  trait ShippingCost extends js.Object {
    var amount: js.UndefOr[Currency] = js.undefined
    var tax: js.UndefOr[Tax] = js.undefined
  }
  
  trait Tax extends Cost {
    var id: js.UndefOr[String] = js.undefined
    var name: js.UndefOr[String] = js.undefined
  }
  
  def cancel(id: String, data: RequestOptions): Unit = js.native
  def cancel(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def cancel(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: RequestOptions, config: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: RequestOptions, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: CallbackFunction[Null], config: RequestOptions): Unit = js.native
  def cancel(id: String, data: CallbackFunction[Null], config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: CallbackFunction[Null], config: CallbackFunction[Null]): Unit = js.native
  def cancel(
    id: String,
    data: CallbackFunction[Null],
    config: CallbackFunction[Null],
    cb: CallbackFunction[Null]
  ): Unit = js.native
  def cancel(id: String, data: EmailRequest): Unit = js.native
  def cancel(id: String, data: EmailRequest, config: RequestOptions): Unit = js.native
  def cancel(id: String, data: EmailRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: EmailRequest, config: CallbackFunction[Null]): Unit = js.native
  def cancel(id: String, data: EmailRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def create(data: Invoice, config: RequestOptions): Unit = js.native
  def create(data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def create(data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def create(data: Invoice, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def del(id: String, config: RequestOptions): Unit = js.native
  def del(id: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def del(id: String, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def del(id: String, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[Null]): Unit = js.native
  def deleteExternalPayment(id: String, trxid: String, config: RequestOptions): Unit = js.native
  def deleteExternalPayment(id: String, trxid: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def deleteExternalPayment(id: String, trxid: String, config: CallbackFunction[Null]): Unit = js.native
  def deleteExternalPayment(id: String, trxid: String, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def deleteExternalRefund(id: String, trxid: String, config: RequestOptions): Unit = js.native
  def deleteExternalRefund(id: String, trxid: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def deleteExternalRefund(id: String, trxid: String, config: CallbackFunction[Null]): Unit = js.native
  def deleteExternalRefund(id: String, trxid: String, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def generateNumber(config: RequestOptions): Unit = js.native
  def generateNumber(config: RequestOptions, cb: CallbackFunction[NumberResponse]): Unit = js.native
  def generateNumber(config: CallbackFunction[NumberResponse]): Unit = js.native
  def generateNumber(config: CallbackFunction[NumberResponse], cb: CallbackFunction[NumberResponse]): Unit = js.native
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def get(id: String, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def get(id: String, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def list(data: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: RequestOptions, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: CallbackFunction[ListResponse], config: CallbackFunction[ListResponse]): Unit = js.native
  def list(
    data: CallbackFunction[ListResponse],
    config: CallbackFunction[ListResponse],
    cb: CallbackFunction[ListResponse]
  ): Unit = js.native
  def list(data: QueryParameters): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse]): Unit = js.native
  def list(data: QueryParameters, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  def qrCode(id: String, height: Double, width: Double, config: RequestOptions): Unit = js.native
  def qrCode(
    id: String,
    height: Double,
    width: Double,
    config: RequestOptions,
    cb: CallbackFunction[QrResponse]
  ): Unit = js.native
  def qrCode(id: String, height: Double, width: Double, config: CallbackFunction[QrResponse]): Unit = js.native
  def qrCode(
    id: String,
    height: Double,
    width: Double,
    config: CallbackFunction[QrResponse],
    cb: CallbackFunction[QrResponse]
  ): Unit = js.native
  def recordPayment(id: String, data: PayRequest, config: RequestOptions): Unit = js.native
  def recordPayment(id: String, data: PayRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def recordPayment(id: String, data: PayRequest, config: CallbackFunction[Null]): Unit = js.native
  def recordPayment(id: String, data: PayRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def recordRefund(
    id: String,
    data: typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.RefundRequest,
    config: RequestOptions
  ): Unit = js.native
  def recordRefund(
    id: String,
    data: typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.RefundRequest,
    config: RequestOptions,
    cb: CallbackFunction[Null]
  ): Unit = js.native
  def recordRefund(
    id: String,
    data: typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.RefundRequest,
    config: CallbackFunction[Null]
  ): Unit = js.native
  def recordRefund(
    id: String,
    data: typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoiceNs.RefundRequest,
    config: CallbackFunction[Null],
    cb: CallbackFunction[Null]
  ): Unit = js.native
  def remind(id: String, data: RequestOptions): Unit = js.native
  def remind(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def remind(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: RequestOptions, config: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: RequestOptions, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: CallbackFunction[Null], config: RequestOptions): Unit = js.native
  def remind(id: String, data: CallbackFunction[Null], config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: CallbackFunction[Null], config: CallbackFunction[Null]): Unit = js.native
  def remind(
    id: String,
    data: CallbackFunction[Null],
    config: CallbackFunction[Null],
    cb: CallbackFunction[Null]
  ): Unit = js.native
  def remind(id: String, data: EmailRequest): Unit = js.native
  def remind(id: String, data: EmailRequest, config: RequestOptions): Unit = js.native
  def remind(id: String, data: EmailRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: EmailRequest, config: CallbackFunction[Null]): Unit = js.native
  def remind(id: String, data: EmailRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
  def search(data: SearchRequest, config: RequestOptions): Unit = js.native
  def search(data: SearchRequest, config: RequestOptions, cb: CallbackFunction[ListResponse]): Unit = js.native
  def search(data: SearchRequest, config: CallbackFunction[ListResponse]): Unit = js.native
  def search(data: SearchRequest, config: CallbackFunction[ListResponse], cb: CallbackFunction[ListResponse]): Unit = js.native
  def send(id: String, config: RequestOptions): Unit = js.native
  def send(id: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def send(id: String, config: CallbackFunction[ListResponse]): Unit = js.native
  def send(id: String, config: CallbackFunction[ListResponse], cb: CallbackFunction[Null]): Unit = js.native
  def update(id: String, data: Invoice, config: RequestOptions): Unit = js.native
  def update(id: String, data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def update(id: String, data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def update(
    id: String,
    data: Invoice,
    config: CallbackFunction[InvoiceResponse],
    cb: CallbackFunction[InvoiceResponse]
  ): Unit = js.native
}

