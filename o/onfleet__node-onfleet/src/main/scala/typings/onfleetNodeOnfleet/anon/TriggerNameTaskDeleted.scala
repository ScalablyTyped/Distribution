package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`8`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskDeleted
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `8`
  
  var triggerName: TaskDeleted
}
object TriggerNameTaskDeleted {
  
  inline def apply(triggerName: TaskDeleted): TriggerNameTaskDeleted = {
    val __obj = js.Dynamic.literal(triggerId = 8, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDeleted]
  }
  
  extension [Self <: TriggerNameTaskDeleted](x: Self) {
    
    inline def setTriggerId(value: `8`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskDeleted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
