package typings.postmark.webhookMod

import typings.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/webhooks/Webhook", "UpdateWebhookRequest")
@js.native
class UpdateWebhookRequest () extends js.Object {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
  var HttpAuth: js.UndefOr[typings.postmark.webhookMod.HttpAuth] = js.native
  var HttpHeaders: js.UndefOr[js.Array[Header]] = js.native
  var Triggers: js.UndefOr[WebhookRequestTriggers] = js.native
  var Url: js.UndefOr[String] = js.native
}

