package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerNameTaskCloned extends WebhookTriggerType {
  var triggerId: `13`
  var triggerName: TaskCloned
}

object TriggerNameTaskCloned {
  @scala.inline
  def apply(triggerId: `13`, triggerName: TaskCloned): TriggerNameTaskCloned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCloned]
  }
}

