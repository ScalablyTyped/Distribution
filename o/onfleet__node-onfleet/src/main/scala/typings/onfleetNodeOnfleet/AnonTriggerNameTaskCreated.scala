package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskCreated extends WebhookTriggerType {
  var triggerId: `6`
  var triggerName: TaskCreated
}

object AnonTriggerNameTaskCreated {
  @scala.inline
  def apply(triggerId: `6`, triggerName: TaskCreated): AnonTriggerNameTaskCreated = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTriggerNameTaskCreated]
  }
}

