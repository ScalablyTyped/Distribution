package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`9`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskAssigned
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `9`
  
  var triggerName: TaskAssigned
}
object TriggerNameTaskAssigned {
  
  inline def apply(triggerName: TaskAssigned): TriggerNameTaskAssigned = {
    val __obj = js.Dynamic.literal(triggerId = 9, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskAssigned]
  }
  
  extension [Self <: TriggerNameTaskAssigned](x: Self) {
    
    inline def setTriggerId(value: `9`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskAssigned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
