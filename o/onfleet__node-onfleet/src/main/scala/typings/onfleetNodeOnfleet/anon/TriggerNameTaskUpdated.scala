package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskUpdated extends WebhookTriggerType {
  
  var triggerId: `7` = js.native
  
  var triggerName: TaskUpdated = js.native
}
object TriggerNameTaskUpdated {
  
  @scala.inline
  def apply(triggerId: `7`, triggerName: TaskUpdated): TriggerNameTaskUpdated = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUpdated]
  }
  
  @scala.inline
  implicit class TriggerNameTaskUpdatedMutableBuilder[Self <: TriggerNameTaskUpdated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `7`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskUpdated): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
