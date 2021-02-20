package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameTaskFailed extends WebhookTriggerType {
  
  var triggerId: `4` = js.native
  
  var triggerName: TaskFailed = js.native
}
object TriggerNameTaskFailed {
  
  @scala.inline
  def apply(triggerId: `4`, triggerName: TaskFailed): TriggerNameTaskFailed = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameTaskFailed]
  }
  
  @scala.inline
  implicit class TriggerNameTaskFailedMutableBuilder[Self <: TriggerNameTaskFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `4`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskFailed): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
