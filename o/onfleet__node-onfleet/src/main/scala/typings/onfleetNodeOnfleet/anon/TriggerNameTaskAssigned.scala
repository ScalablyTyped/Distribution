package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskAssigned extends WebhookTriggerType {
  
  var triggerId: `9` = js.native
  
  var triggerName: TaskAssigned = js.native
}
object TriggerNameTaskAssigned {
  
  @scala.inline
  def apply(triggerId: `9`, triggerName: TaskAssigned): TriggerNameTaskAssigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskAssigned]
  }
  
  @scala.inline
  implicit class TriggerNameTaskAssignedMutableBuilder[Self <: TriggerNameTaskAssigned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `9`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskAssigned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
