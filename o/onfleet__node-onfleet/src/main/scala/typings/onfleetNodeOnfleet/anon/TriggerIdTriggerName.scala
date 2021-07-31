package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerIdTriggerName
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `2`
  
  var triggerName: TaskArrival
}
object TriggerIdTriggerName {
  
  @scala.inline
  def apply(triggerName: TaskArrival): TriggerIdTriggerName = {
    val __obj = js.Dynamic.literal(triggerId = 2, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerIdTriggerName]
  }
  
  @scala.inline
  implicit class TriggerIdTriggerNameMutableBuilder[Self <: TriggerIdTriggerName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `2`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskArrival): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
