package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerId
  extends StObject
     with WebhookTriggerType {
  
  var triggerId: `0`
  
  var triggerName: TaskStarted
}
object TriggerId {
  
  inline def apply(triggerName: TaskStarted): TriggerId = {
    val __obj = js.Dynamic.literal(triggerId = 0, triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerId]
  }
  
  extension [Self <: TriggerId](x: Self) {
    
    inline def setTriggerId(value: `0`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskStarted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
