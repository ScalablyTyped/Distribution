package typings.postmark.distClientModelsWebhooksWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenWebhookTrigger extends WebhookTrigger {
  var PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined
}

object OpenWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean, PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined): OpenWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (!js.isUndefined(PostFirstOpenOnly)) __obj.updateDynamic("PostFirstOpenOnly")(PostFirstOpenOnly)
    __obj.asInstanceOf[OpenWebhookTrigger]
  }
}

