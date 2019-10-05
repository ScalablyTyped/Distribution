package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.update")
@js.native
object update extends js.Object {
  def apply(id: String, data: Invoice, config: RequestOptions): Unit = js.native
  def apply(id: String, data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(id: String, data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(
    id: String,
    data: Invoice,
    config: CallbackFunction[InvoiceResponse],
    cb: CallbackFunction[InvoiceResponse]
  ): Unit = js.native
}

