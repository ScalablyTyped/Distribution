package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebhookResult extends WebhookResult {
  var isEnabled: Boolean
}

object GetWebhookResult {
  @scala.inline
  def apply(
    count: Double,
    id: String,
    isEnabled: Boolean,
    trigger: /* import warning: importer.ImportType#apply Failed type conversion: @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Webhooks.WebhookTriggerType['triggerId'] */ js.Any,
    url: String
  ): GetWebhookResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWebhookResult]
  }
}

