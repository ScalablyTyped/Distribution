package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.create")
@js.native
object create extends js.Object {
  def apply(data: Invoice, config: RequestOptions): Unit = js.native
  def apply(data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(data: Invoice, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[InvoiceResponse]): Unit = js.native
}

