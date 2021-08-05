package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskFailed
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `4`
  
  var triggerName: TaskFailed
}
object TriggerNameTaskFailed {
  
  inline def apply(triggerName: TaskFailed): TriggerNameTaskFailed = {
    val __obj = js.Dynamic.literal(triggerId = 4, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskFailed]
  }
  
  extension [Self <: TriggerNameTaskFailed](x: Self) {
    
    inline def setTriggerId(value: `4`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskFailed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
