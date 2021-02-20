package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolePermission extends StObject {
  
  // Actions
  var resourceActions: js.UndefOr[NullableOption[js.Array[ResourceAction]]] = js.native
}
object RolePermission {
  
  @scala.inline
  def apply(): RolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RolePermission]
  }
  
  @scala.inline
  implicit class RolePermissionMutableBuilder[Self <: RolePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceActions(value: NullableOption[js.Array[ResourceAction]]): Self = StObject.set(x, "resourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceActionsNull: Self = StObject.set(x, "resourceActions", null)
    
    @scala.inline
    def setResourceActionsUndefined: Self = StObject.set(x, "resourceActions", js.undefined)
    
    @scala.inline
    def setResourceActionsVarargs(value: ResourceAction*): Self = StObject.set(x, "resourceActions", js.Array(value :_*))
  }
}
