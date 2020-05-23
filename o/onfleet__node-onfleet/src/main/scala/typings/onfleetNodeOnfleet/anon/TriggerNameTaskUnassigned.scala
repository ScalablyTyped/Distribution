package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerNameTaskUnassigned extends WebhookTriggerType {
  var triggerId: `10`
  var triggerName: TaskUnassigned
}

object TriggerNameTaskUnassigned {
  @scala.inline
  def apply(triggerId: `10`, triggerName: TaskUnassigned): TriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUnassigned]
  }
}

