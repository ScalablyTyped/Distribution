package typings.paypalRestSdk.mod.notification.webhookEvent

import typings.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "notification.webhookEvent.verify")
@js.native
object verify extends js.Object {
  
  def apply(headers: js.Any, body: WebhookEvent, id: String, cb: CallbackFunction[WebhookVerifyResponse]): Unit = js.native
}
