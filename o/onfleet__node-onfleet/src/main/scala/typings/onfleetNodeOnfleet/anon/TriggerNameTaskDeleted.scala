package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskDeleted extends WebhookTriggerType {
  
  var triggerId: `8` = js.native
  
  var triggerName: TaskDeleted = js.native
}
object TriggerNameTaskDeleted {
  
  @scala.inline
  def apply(triggerId: `8`, triggerName: TaskDeleted): TriggerNameTaskDeleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDeleted]
  }
  
  @scala.inline
  implicit class TriggerNameTaskDeletedMutableBuilder[Self <: TriggerNameTaskDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `8`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskDeleted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
