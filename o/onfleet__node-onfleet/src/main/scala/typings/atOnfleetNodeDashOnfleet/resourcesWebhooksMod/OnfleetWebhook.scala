package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetWebhook extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
  var trigger: /* import warning: importer.ImportType#apply Failed type conversion: @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Webhooks.WebhookTriggerType['triggerId'] */ js.Any
  var url: String
}

object OnfleetWebhook {
  @scala.inline
  def apply(
    trigger: /* import warning: importer.ImportType#apply Failed type conversion: @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Webhooks.WebhookTriggerType['triggerId'] */ js.Any,
    url: String,
    threshold: Int | Double = null
  ): OnfleetWebhook = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetWebhook]
  }
}

