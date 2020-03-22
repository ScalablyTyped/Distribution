package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskUnassigned extends WebhookTriggerType {
  var triggerId: `10`
  var triggerName: TaskUnassigned
}

object AnonTriggerNameTaskUnassigned {
  @scala.inline
  def apply(triggerId: `10`, triggerName: TaskUnassigned): AnonTriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskUnassigned]
  }
}

