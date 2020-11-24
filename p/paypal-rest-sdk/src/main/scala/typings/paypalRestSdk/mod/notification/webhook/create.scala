package typings.paypalRestSdk.mod.notification.webhook

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "notification.webhook.create")
@js.native
object create extends js.Object {
  
  def apply(data: Webhook, config: RequestOptions): Unit = js.native
  def apply(data: Webhook, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
  def apply(data: Webhook, config: CallbackFunction[Webhook]): Unit = js.native
  def apply(data: Webhook, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
}
