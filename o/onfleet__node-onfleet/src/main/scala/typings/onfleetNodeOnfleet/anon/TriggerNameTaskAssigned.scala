package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskAssigned extends WebhookTriggerType {
  var triggerId: `9` = js.native
  var triggerName: TaskAssigned = js.native
}

object TriggerNameTaskAssigned {
  @scala.inline
  def apply(triggerId: `9`, triggerName: TaskAssigned): TriggerNameTaskAssigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskAssigned]
  }
  @scala.inline
  implicit class TriggerNameTaskAssignedOps[Self <: TriggerNameTaskAssigned] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTriggerId(value: `9`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskAssigned): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

