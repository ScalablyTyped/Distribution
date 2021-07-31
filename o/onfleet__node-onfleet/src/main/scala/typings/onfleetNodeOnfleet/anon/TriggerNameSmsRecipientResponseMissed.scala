package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameSmsRecipientResponseMissed
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `14`
  
  var triggerName: SmsRecipientResponseMissed
}
object TriggerNameSmsRecipientResponseMissed {
  
  @scala.inline
  def apply(triggerName: SmsRecipientResponseMissed): TriggerNameSmsRecipientResponseMissed = {
    val __obj = js.Dynamic.literal(triggerId = 14, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameSmsRecipientResponseMissed]
  }
  
  @scala.inline
  implicit class TriggerNameSmsRecipientResponseMissedMutableBuilder[Self <: TriggerNameSmsRecipientResponseMissed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `14`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: SmsRecipientResponseMissed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
