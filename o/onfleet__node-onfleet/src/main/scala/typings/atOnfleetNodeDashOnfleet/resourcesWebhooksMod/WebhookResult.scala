package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookResult extends js.Object {
  var count: Double
  var id: String
  var trigger: /* import warning: importer.ImportType#apply Failed type conversion: @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Webhooks.WebhookTriggerType['triggerId'] */ js.Any
  var url: String
}

object WebhookResult {
  @scala.inline
  def apply(
    count: Double,
    id: String,
    trigger: /* import warning: importer.ImportType#apply Failed type conversion: @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Webhooks.WebhookTriggerType['triggerId'] */ js.Any,
    url: String
  ): WebhookResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookResult]
  }
}

