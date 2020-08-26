package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskCompleted extends WebhookTriggerType {
  var triggerId: `3` = js.native
  var triggerName: TaskCompleted = js.native
}

object TriggerNameTaskCompleted {
  @scala.inline
  def apply(triggerId: `3`, triggerName: TaskCompleted): TriggerNameTaskCompleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCompleted]
  }
  @scala.inline
  implicit class TriggerNameTaskCompletedOps[Self <: TriggerNameTaskCompleted] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `3`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskCompleted): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

