package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskUnassigned extends WebhookTriggerType {
  var triggerId: `10` = js.native
  var triggerName: TaskUnassigned = js.native
}

object TriggerNameTaskUnassigned {
  @scala.inline
  def apply(triggerId: `10`, triggerName: TaskUnassigned): TriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUnassigned]
  }
  @scala.inline
  implicit class TriggerNameTaskUnassignedOps[Self <: TriggerNameTaskUnassigned] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `10`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskUnassigned): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

