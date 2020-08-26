package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerIdTriggerName extends WebhookTriggerType {
  var triggerId: `2` = js.native
  var triggerName: TaskArrival = js.native
}

object TriggerIdTriggerName {
  @scala.inline
  def apply(triggerId: `2`, triggerName: TaskArrival): TriggerIdTriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerIdTriggerName]
  }
  @scala.inline
  implicit class TriggerIdTriggerNameOps[Self <: TriggerIdTriggerName] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `2`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskArrival): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

