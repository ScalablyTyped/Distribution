package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RolePermission extends StObject {
  
  // Resource Actions each containing a set of allowed and not allowed permissions.
  var resourceActions: js.UndefOr[NullableOption[js.Array[ResourceAction]]] = js.undefined
}
object RolePermission {
  
  inline def apply(): RolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RolePermission]
  }
  
  extension [Self <: RolePermission](x: Self) {
    
    inline def setResourceActions(value: NullableOption[js.Array[ResourceAction]]): Self = StObject.set(x, "resourceActions", value.asInstanceOf[js.Any])
    
    inline def setResourceActionsNull: Self = StObject.set(x, "resourceActions", null)
    
    inline def setResourceActionsUndefined: Self = StObject.set(x, "resourceActions", js.undefined)
    
    inline def setResourceActionsVarargs(value: ResourceAction*): Self = StObject.set(x, "resourceActions", js.Array(value*))
  }
}
