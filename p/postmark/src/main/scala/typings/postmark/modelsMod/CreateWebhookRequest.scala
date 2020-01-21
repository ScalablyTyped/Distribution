package typings.postmark.modelsMod

import typings.postmark.webhookMod.HttpAuth
import typings.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "CreateWebhookRequest")
@js.native
class CreateWebhookRequest ()
  extends typings.postmark.webhookMod.CreateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(
    url: String,
    triggers: WebhookRequestTriggers,
    httpAuth: HttpAuth,
    httpHeaders: js.Array[typings.postmark.messageSupportingTypesMod.Header]
  ) = this()
}

