package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameSmsRecipientResponseMissed extends WebhookTriggerType {
  var triggerId: `14`
  var triggerName: SmsRecipientResponseMissed
}

object AnonTriggerNameSmsRecipientResponseMissed {
  @scala.inline
  def apply(triggerId: `14`, triggerName: SmsRecipientResponseMissed): AnonTriggerNameSmsRecipientResponseMissed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTriggerNameSmsRecipientResponseMissed]
  }
}

