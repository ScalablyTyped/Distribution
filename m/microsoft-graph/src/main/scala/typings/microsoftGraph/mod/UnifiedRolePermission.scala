package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRolePermission extends StObject {
  
  // Set of tasks that can be performed on a resource. Required.
  var allowedResourceActions: js.UndefOr[js.Array[String]] = js.undefined
  
  // Optional constraints that must be met for the permission to be effective. Not supported for custom roles.
  var condition: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Set of tasks that may not be performed on a resource. Not yet supported.
  var excludedResourceActions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object UnifiedRolePermission {
  
  inline def apply(): UnifiedRolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRolePermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRolePermission] (val x: Self) extends AnyVal {
    
    inline def setAllowedResourceActions(value: js.Array[String]): Self = StObject.set(x, "allowedResourceActions", value.asInstanceOf[js.Any])
    
    inline def setAllowedResourceActionsUndefined: Self = StObject.set(x, "allowedResourceActions", js.undefined)
    
    inline def setAllowedResourceActionsVarargs(value: String*): Self = StObject.set(x, "allowedResourceActions", js.Array(value*))
    
    inline def setCondition(value: NullableOption[String]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setExcludedResourceActions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "excludedResourceActions", value.asInstanceOf[js.Any])
    
    inline def setExcludedResourceActionsNull: Self = StObject.set(x, "excludedResourceActions", null)
    
    inline def setExcludedResourceActionsUndefined: Self = StObject.set(x, "excludedResourceActions", js.undefined)
    
    inline def setExcludedResourceActionsVarargs(value: String*): Self = StObject.set(x, "excludedResourceActions", js.Array(value*))
  }
}
