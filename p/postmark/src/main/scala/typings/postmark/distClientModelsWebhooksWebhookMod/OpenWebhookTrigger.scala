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
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(PostFirstOpenOnly)) __obj.updateDynamic("PostFirstOpenOnly")(PostFirstOpenOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWebhookTrigger]
  }
}

