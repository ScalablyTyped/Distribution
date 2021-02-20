package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskDelayed extends WebhookTriggerType {
  
  var triggerId: `12` = js.native
  
  var triggerName: TaskDelayed = js.native
}
object TriggerNameTaskDelayed {
  
  @scala.inline
  def apply(triggerId: `12`, triggerName: TaskDelayed): TriggerNameTaskDelayed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskDelayed]
  }
  
  @scala.inline
  implicit class TriggerNameTaskDelayedMutableBuilder[Self <: TriggerNameTaskDelayed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `12`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskDelayed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
