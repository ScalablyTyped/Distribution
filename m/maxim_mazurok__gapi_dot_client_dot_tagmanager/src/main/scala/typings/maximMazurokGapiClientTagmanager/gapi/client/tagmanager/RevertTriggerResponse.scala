package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertTriggerResponse extends StObject {
  
  /**
    * Trigger as it appears in the latest container version since the last workspace synchronization operation. If no trigger is present, that means the trigger was deleted in the latest
    * container version.
    */
  var trigger: js.UndefOr[Trigger] = js.undefined
}
object RevertTriggerResponse {
  
  @scala.inline
  def apply(): RevertTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertTriggerResponse]
  }
  
  @scala.inline
  implicit class RevertTriggerResponseMutableBuilder[Self <: RevertTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
