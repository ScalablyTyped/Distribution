package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.recordRefund")
@js.native
object recordRefund extends js.Object {
  def apply(id: String, data: RefundRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: RefundRequest, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: RefundRequest, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, data: RefundRequest, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}

