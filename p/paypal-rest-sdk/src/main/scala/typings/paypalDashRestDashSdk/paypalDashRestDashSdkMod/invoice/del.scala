package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.del")
@js.native
object del extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[InvoiceResponse], cb: CallbackFunction[Null]): Unit = js.native
}

