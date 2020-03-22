package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskDelayed extends WebhookTriggerType {
  var triggerId: `12`
  var triggerName: TaskDelayed
}

object AnonTriggerNameTaskDelayed {
  @scala.inline
  def apply(triggerId: `12`, triggerName: TaskDelayed): AnonTriggerNameTaskDelayed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskDelayed]
  }
}

