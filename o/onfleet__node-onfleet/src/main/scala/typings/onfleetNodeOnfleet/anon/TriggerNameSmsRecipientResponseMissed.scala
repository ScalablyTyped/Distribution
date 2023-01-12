package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`14`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
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
  
  inline def apply(triggerName: SmsRecipientResponseMissed): TriggerNameSmsRecipientResponseMissed = {
    val __obj = js.Dynamic.literal(triggerId = 14, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameSmsRecipientResponseMissed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerNameSmsRecipientResponseMissed] (val x: Self) extends AnyVal {
    
    inline def setTriggerId(value: `14`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: SmsRecipientResponseMissed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
