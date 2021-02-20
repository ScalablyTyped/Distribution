package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerName extends WebhookTriggerType {
  
  var triggerId: `1` = js.native
  
  var triggerName: TaskEta = js.native
}
object TriggerName {
  
  @scala.inline
  def apply(triggerId: `1`, triggerName: TaskEta): TriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerName]
  }
  
  @scala.inline
  implicit class TriggerNameMutableBuilder[Self <: TriggerName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerId(value: `1`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: TaskEta): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
