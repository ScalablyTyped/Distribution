package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`4`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerNameTaskFailed] (val x: Self) extends AnyVal {
    
    inline def setTriggerId(value: `4`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskFailed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
