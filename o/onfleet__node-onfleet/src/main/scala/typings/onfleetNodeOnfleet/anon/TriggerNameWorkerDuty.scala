package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
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
  implicit class TriggerNameWorkerDutyOps[Self <: TriggerNameWorkerDuty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTriggerId(value: `5`): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: WorkerDuty): Self = this.set("triggerName", value.asInstanceOf[js.Any])
  }
}
