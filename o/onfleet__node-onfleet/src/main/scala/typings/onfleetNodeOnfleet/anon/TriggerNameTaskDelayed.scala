package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameTaskDelayed extends WebhookTriggerType {
  var triggerId: `12` = js.native
  var triggerName: TaskDelayed = js.native
}

object TriggerNameTaskDelayed {
  @scala.inline
  def apply(triggerId: `12`, triggerName: TaskDelayed): TriggerNameTaskDelayed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDelayed]
  }
  @scala.inline
  implicit class TriggerNameTaskDelayedOps[Self <: TriggerNameTaskDelayed] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `12`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskDelayed): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

