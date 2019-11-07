package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsWebhooksWebhookMod.HttpAuth
import typings.postmark.distClientModelsWebhooksWebhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.UpdateWebhookRequest")
@js.native
class UpdateWebhookRequest ()
  extends typings.postmark.distClientModelsMod.UpdateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(
    url: String,
    triggers: WebhookRequestTriggers,
    httpAuth: HttpAuth,
    httpHeaders: js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]
  ) = this()
}

