package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameTaskCompleted
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `3`
  
  var triggerName: TaskCompleted
}
object TriggerNameTaskCompleted {
  
  @scala.inline
  def apply(triggerName: TaskCompleted): TriggerNameTaskCompleted = {
    val __obj = js.Dynamic.literal(triggerId = 3, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskCompleted]
  }
  
  @scala.inline
  implicit class TriggerNameTaskCompletedMutableBuilder[Self <: TriggerNameTaskCompleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `3`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskCompleted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
