package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarSharingMessageAction extends StObject {
  
  var action: js.UndefOr[NullableOption[CalendarSharingAction]] = js.undefined
  
  var actionType: js.UndefOr[NullableOption[CalendarSharingActionType]] = js.undefined
  
  var importance: js.UndefOr[NullableOption[CalendarSharingActionImportance]] = js.undefined
}
object CalendarSharingMessageAction {
  
  inline def apply(): CalendarSharingMessageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessageAction]
  }
  
  extension [Self <: CalendarSharingMessageAction](x: Self) {
    
    inline def setAction(value: NullableOption[CalendarSharingAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionType(value: NullableOption[CalendarSharingActionType]): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setImportance(value: NullableOption[CalendarSharingActionImportance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
  }
}
