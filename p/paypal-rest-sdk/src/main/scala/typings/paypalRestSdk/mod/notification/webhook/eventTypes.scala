package typings.paypalRestSdk.mod.notification.webhook

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import typings.paypalRestSdk.mod.notification.EventTypesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhook.eventTypes")
@js.native
object eventTypes extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[EventTypesResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[EventTypesResponse], cb: CallbackFunction[EventTypesResponse]): Unit = js.native
}

