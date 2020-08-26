package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskCreated extends WebhookTriggerType {
  var triggerId: `6` = js.native
  var triggerName: TaskCreated = js.native
}

object TriggerNameTaskCreated {
  @scala.inline
  def apply(triggerId: `6`, triggerName: TaskCreated): TriggerNameTaskCreated = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCreated]
  }
  @scala.inline
  implicit class TriggerNameTaskCreatedOps[Self <: TriggerNameTaskCreated] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `6`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskCreated): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

