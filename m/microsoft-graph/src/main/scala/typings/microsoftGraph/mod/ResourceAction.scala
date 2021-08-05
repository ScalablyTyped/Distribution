package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAction extends StObject {
  
  // Allowed Actions
  var allowedResourceActions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Not Allowed Actions
  var notAllowedResourceActions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ResourceAction {
  
  inline def apply(): ResourceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAction]
  }
  
  extension [Self <: ResourceAction](x: Self) {
    
    inline def setAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "allowedResourceActions", value.asInstanceOf[js.Any])
    
    inline def setAllowedResourceActionsNull: Self = StObject.set(x, "allowedResourceActions", null)
    
    inline def setAllowedResourceActionsUndefined: Self = StObject.set(x, "allowedResourceActions", js.undefined)
    
    inline def setAllowedResourceActionsVarargs(value: String*): Self = StObject.set(x, "allowedResourceActions", js.Array(value :_*))
    
    inline def setNotAllowedResourceActions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "notAllowedResourceActions", value.asInstanceOf[js.Any])
    
    inline def setNotAllowedResourceActionsNull: Self = StObject.set(x, "notAllowedResourceActions", null)
    
    inline def setNotAllowedResourceActionsUndefined: Self = StObject.set(x, "notAllowedResourceActions", js.undefined)
    
    inline def setNotAllowedResourceActionsVarargs(value: String*): Self = StObject.set(x, "notAllowedResourceActions", js.Array(value :_*))
  }
}
