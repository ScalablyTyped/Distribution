package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`10`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskUnassigned
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `10`
  
  var triggerName: TaskUnassigned
}
object TriggerNameTaskUnassigned {
  
  inline def apply(triggerName: TaskUnassigned): TriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = 10, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUnassigned]
  }
  
  extension [Self <: TriggerNameTaskUnassigned](x: Self) {
    
    inline def setTriggerId(value: `10`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskUnassigned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
