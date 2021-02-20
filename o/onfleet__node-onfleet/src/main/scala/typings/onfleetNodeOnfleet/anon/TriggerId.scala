package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerId extends WebhookTriggerType {
  
  var triggerId: `0` = js.native
  
  var triggerName: TaskStarted = js.native
}
object TriggerId {
  
  @scala.inline
  def apply(triggerId: `0`, triggerName: TaskStarted): TriggerId = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerId]
  }
  
  @scala.inline
  implicit class TriggerIdMutableBuilder[Self <: TriggerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `0`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskStarted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
