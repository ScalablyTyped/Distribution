package typings.postmark.webhookMod

import typings.postmark.messageSupportingTypesMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/webhooks/Webhook", "CreateWebhookRequest")
@js.native
class CreateWebhookRequest () extends UpdateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth, httpHeaders: js.Array[Header]) = this()
}

