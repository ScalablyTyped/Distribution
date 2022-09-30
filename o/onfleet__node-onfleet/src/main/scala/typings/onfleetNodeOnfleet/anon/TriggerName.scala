package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`1`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerName
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `1`
  
  var triggerName: TaskEta
}
object TriggerName {
  
  inline def apply(triggerName: TaskEta): TriggerName = {
    val __obj = js.Dynamic.literal(triggerId = 1, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerName]
  }
  
  extension [Self <: TriggerName](x: Self) {
    
    inline def setTriggerId(value: `1`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskEta): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
