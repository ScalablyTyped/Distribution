package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskDeleted extends WebhookTriggerType {
  var triggerId: `8`
  var triggerName: TaskDeleted
}

object AnonTriggerNameTaskDeleted {
  @scala.inline
  def apply(triggerId: `8`, triggerName: TaskDeleted): AnonTriggerNameTaskDeleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskDeleted]
  }
}

