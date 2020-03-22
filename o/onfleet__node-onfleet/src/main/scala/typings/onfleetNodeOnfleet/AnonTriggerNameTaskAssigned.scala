package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskAssigned extends WebhookTriggerType {
  var triggerId: `9`
  var triggerName: TaskAssigned
}

object AnonTriggerNameTaskAssigned {
  @scala.inline
  def apply(triggerId: `9`, triggerName: TaskAssigned): AnonTriggerNameTaskAssigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskAssigned]
  }
}

