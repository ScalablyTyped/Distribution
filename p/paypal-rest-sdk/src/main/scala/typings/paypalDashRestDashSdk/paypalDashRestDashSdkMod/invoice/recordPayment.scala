package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.recordPayment")
@js.native
object recordPayment extends js.Object {
  def apply(id: String, data: PayRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: PayRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: PayRequest, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: PayRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}

