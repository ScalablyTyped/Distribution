package typings.atOnfleetNodeDashOnfleet

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`9`
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_9 extends WebhookTriggerType {
  var triggerId: `9`
  var triggerName: TaskAssigned
}

object Anon_9 {
  @scala.inline
  def apply(triggerId: `9`, triggerName: TaskAssigned): Anon_9 = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_9]
  }
}

