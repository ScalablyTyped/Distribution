package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`0`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerType
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerId] (val x: Self) extends AnyVal {
    
    inline def setTriggerId(value: `0`): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerName(value: TaskStarted): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
  }
}
