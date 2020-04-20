package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskUpdated extends WebhookTriggerType {
  var triggerId: `7`
  var triggerName: TaskUpdated
}

object AnonTriggerNameTaskUpdated {
  @scala.inline
  def apply(triggerId: `7`, triggerName: TaskUpdated): AnonTriggerNameTaskUpdated = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTriggerNameTaskUpdated]
  }
}

