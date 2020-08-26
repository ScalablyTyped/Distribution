package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerNameSmsRecipientResponseMissed extends WebhookTriggerType {
  var triggerId: `14` = js.native
  var triggerName: SmsRecipientResponseMissed = js.native
}

object TriggerNameSmsRecipientResponseMissed {
  @scala.inline
  def apply(triggerId: `14`, triggerName: SmsRecipientResponseMissed): TriggerNameSmsRecipientResponseMissed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameSmsRecipientResponseMissed]
  }
  @scala.inline
  implicit class TriggerNameSmsRecipientResponseMissedOps[Self <: TriggerNameSmsRecipientResponseMissed] (val x: Self) extends AnyVal {
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
    def setTriggerId(value: `14`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: SmsRecipientResponseMissed): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
  
}

