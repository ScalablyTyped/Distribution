package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceResourceAccess extends js.Object {
  
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.native
  
  var resourceAppId: js.UndefOr[String] = js.native
}
object InstanceResourceAccess {
  
  @scala.inline
  def apply(): InstanceResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceResourceAccess]
  }
  
  @scala.inline
  implicit class InstanceResourceAccessOps[Self <: InstanceResourceAccess] (val x: Self) extends AnyVal {
    
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
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[ResourcePermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setResourceAppId(value: String): Self = this.set("resourceAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAppId: Self = this.set("resourceAppId", js.undefined)
  }
}
