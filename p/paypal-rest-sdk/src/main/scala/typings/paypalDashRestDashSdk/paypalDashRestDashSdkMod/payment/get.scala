package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.PaymentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.get")
@js.native
object get extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}

