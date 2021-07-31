package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoboScriptExecution extends StObject {
  
  /** The number of Robo script actions executed successfully. */
  var successfulActions: js.UndefOr[Double] = js.undefined
  
  /** The total number of actions in the Robo script. */
  var totalActions: js.UndefOr[Double] = js.undefined
}
object RoboScriptExecution {
  
  @scala.inline
  def apply(): RoboScriptExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoboScriptExecution]
  }
  
  @scala.inline
  implicit class RoboScriptExecutionMutableBuilder[Self <: RoboScriptExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessfulActions(value: Double): Self = StObject.set(x, "successfulActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulActionsUndefined: Self = StObject.set(x, "successfulActions", js.undefined)
    
    @scala.inline
    def setTotalActions(value: Double): Self = StObject.set(x, "totalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalActionsUndefined: Self = StObject.set(x, "totalActions", js.undefined)
  }
}
