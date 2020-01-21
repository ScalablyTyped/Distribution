package typings.postmark.mod.Models

import typings.postmark.webhookMod.HttpAuth
import typings.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.UpdateWebhookRequest")
@js.native
class UpdateWebhookRequest ()
  extends typings.postmark.modelsMod.UpdateWebhookRequest {
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

