package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceWebhookTrigger extends WebhookTrigger {
  var IncludeContent: js.UndefOr[Boolean] = js.undefined
}

object BounceWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean, IncludeContent: js.UndefOr[Boolean] = js.undefined): BounceWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeContent)) __obj.updateDynamic("IncludeContent")(IncludeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceWebhookTrigger]
  }
}

