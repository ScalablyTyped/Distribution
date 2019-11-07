package typings.postmark.distClientModelsWebhooksWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceWebhookTrigger extends WebhookTrigger {
  var IncludeContent: js.UndefOr[Boolean] = js.undefined
}

object BounceWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean, IncludeContent: js.UndefOr[Boolean] = js.undefined): BounceWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (!js.isUndefined(IncludeContent)) __obj.updateDynamic("IncludeContent")(IncludeContent)
    __obj.asInstanceOf[BounceWebhookTrigger]
  }
}

