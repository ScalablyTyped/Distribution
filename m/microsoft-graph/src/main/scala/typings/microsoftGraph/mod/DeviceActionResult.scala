package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceActionResult extends StObject {
  
  // Action name
  var actionName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // State of the action. Possible values are: none, pending, canceled, active, done, failed, notSupported.
  var actionState: js.UndefOr[ActionState] = js.undefined
  
  // Time the action state was last updated
  var lastUpdatedDateTime: js.UndefOr[String] = js.undefined
  
  // Time the action was initiated
  var startDateTime: js.UndefOr[String] = js.undefined
}
object DeviceActionResult {
  
  @scala.inline
  def apply(): DeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceActionResult]
  }
  
  @scala.inline
  implicit class DeviceActionResultMutableBuilder[Self <: DeviceActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: NullableOption[String]): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameNull: Self = StObject.set(x, "actionName", null)
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setActionState(value: ActionState): Self = StObject.set(x, "actionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionStateUndefined: Self = StObject.set(x, "actionState", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: String): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
