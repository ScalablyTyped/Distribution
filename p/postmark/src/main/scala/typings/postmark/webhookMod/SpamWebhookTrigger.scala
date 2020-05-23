package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamWebhookTrigger extends WebhookTrigger {
  var IncludeContent: js.UndefOr[Boolean] = js.undefined
}

object SpamWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean, IncludeContent: js.UndefOr[Boolean] = js.undefined): SpamWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeContent)) __obj.updateDynamic("IncludeContent")(IncludeContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamWebhookTrigger]
  }
}

