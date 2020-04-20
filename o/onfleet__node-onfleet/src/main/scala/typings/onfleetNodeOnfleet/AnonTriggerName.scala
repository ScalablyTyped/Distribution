package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerName extends WebhookTriggerType {
  var triggerId: `1`
  var triggerName: TaskEta
}

object AnonTriggerName {
  @scala.inline
  def apply(triggerId: `1`, triggerName: TaskEta): AnonTriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTriggerName]
  }
}

