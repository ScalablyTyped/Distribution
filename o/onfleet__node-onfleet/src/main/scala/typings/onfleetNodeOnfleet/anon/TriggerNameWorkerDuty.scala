package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerNameWorkerDuty
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `5`
  
  var triggerName: WorkerDuty
}
object TriggerNameWorkerDuty {
  
  @scala.inline
  def apply(triggerName: WorkerDuty): TriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = 5, triggerName = triggerName.asInstanceOf[js.Any])
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
