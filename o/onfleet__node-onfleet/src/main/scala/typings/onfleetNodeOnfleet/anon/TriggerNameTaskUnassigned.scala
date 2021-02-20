package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskUnassigned extends WebhookTriggerType {
  
  var triggerId: `10` = js.native
  
  var triggerName: TaskUnassigned = js.native
}
object TriggerNameTaskUnassigned {
  
  @scala.inline
  def apply(triggerId: `10`, triggerName: TaskUnassigned): TriggerNameTaskUnassigned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskUnassigned]
  }
  
  @scala.inline
  implicit class TriggerNameTaskUnassignedMutableBuilder[Self <: TriggerNameTaskUnassigned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `10`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskUnassigned): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
