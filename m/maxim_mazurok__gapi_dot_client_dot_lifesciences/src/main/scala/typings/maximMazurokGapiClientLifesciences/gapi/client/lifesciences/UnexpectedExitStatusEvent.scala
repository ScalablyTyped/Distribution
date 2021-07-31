package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnexpectedExitStatusEvent extends StObject {
  
  /** The numeric ID of the action that started the container. */
  var actionId: js.UndefOr[Double] = js.undefined
  
  /** The exit status of the container. */
  var exitStatus: js.UndefOr[Double] = js.undefined
}
object UnexpectedExitStatusEvent {
  
  @scala.inline
  def apply(): UnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnexpectedExitStatusEvent]
  }
  
  @scala.inline
  implicit class UnexpectedExitStatusEventMutableBuilder[Self <: UnexpectedExitStatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setExitStatus(value: Double): Self = StObject.set(x, "exitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitStatusUndefined: Self = StObject.set(x, "exitStatus", js.undefined)
  }
}
