package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerNameWorkerDuty extends WebhookTriggerType {
  
  var triggerId: `5` = js.native
  
  var triggerName: WorkerDuty = js.native
}
object TriggerNameWorkerDuty {
  
  @scala.inline
  def apply(triggerId: `5`, triggerName: WorkerDuty): TriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameWorkerDuty]
  }
  
  @scala.inline
  implicit class TriggerNameWorkerDutyMutableBuilder[Self <: TriggerNameWorkerDuty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `5`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: WorkerDuty): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
