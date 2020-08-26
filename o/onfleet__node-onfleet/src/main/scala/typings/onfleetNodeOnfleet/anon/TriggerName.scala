package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerName extends WebhookTriggerType {
  var triggerId: `1` = js.native
  var triggerName: TaskEta = js.native
}

object TriggerName {
  @scala.inline
  def apply(triggerId: `1`, triggerName: TaskEta): TriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerName]
  }
  @scala.inline
  implicit class TriggerNameOps[Self <: TriggerName] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `1`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: TaskEta): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

