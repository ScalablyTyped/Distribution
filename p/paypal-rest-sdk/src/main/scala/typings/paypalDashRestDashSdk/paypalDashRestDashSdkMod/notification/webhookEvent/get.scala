package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.webhookEvent

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
@js.native
object get extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
  def apply(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
  def apply(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
}

