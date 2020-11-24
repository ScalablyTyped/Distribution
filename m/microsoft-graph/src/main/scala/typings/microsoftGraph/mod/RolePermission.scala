package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolePermission extends js.Object {
  
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
  implicit class RolePermissionOps[Self <: RolePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceActionsVarargs(value: ResourceAction*): Self = this.set("resourceActions", js.Array(value :_*))
    
    @scala.inline
    def setResourceActions(value: NullableOption[js.Array[ResourceAction]]): Self = this.set("resourceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceActions: Self = this.set("resourceActions", js.undefined)
    
    @scala.inline
    def setResourceActionsNull: Self = this.set("resourceActions", null)
  }
}
