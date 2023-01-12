package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`13`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskCloned
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `13`
  
  var triggerName: TaskCloned
}
object TriggerNameTaskCloned {
  
  inline def apply(triggerName: TaskCloned): TriggerNameTaskCloned = {
    val __obj = js.Dynamic.literal(triggerId = 13, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCloned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerNameTaskCloned] (val x: Self) extends AnyVal {
    
    inline def setTriggerId(value: `13`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskCloned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
