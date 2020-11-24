package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InheritedFrom extends js.Object {
  
  /** Deprecated - use permissionDetails/inherited instead. */
  var inherited: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use permissionDetails/inheritedFrom instead. */
  var inheritedFrom: js.UndefOr[String] = js.native
  
  /** Deprecated - use permissionDetails/role instead. */
  var role: js.UndefOr[String] = js.native
  
  /** Deprecated - use permissionDetails/permissionType instead. */
  var teamDrivePermissionType: js.UndefOr[String] = js.native
}
object InheritedFrom {
  
  @scala.inline
  def apply(): InheritedFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritedFrom]
  }
  
  @scala.inline
  implicit class InheritedFromOps[Self <: InheritedFrom] (val x: Self) extends AnyVal {
    
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
    def setInherited(value: Boolean): Self = this.set("inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherited: Self = this.set("inherited", js.undefined)
    
    @scala.inline
    def setInheritedFrom(value: String): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritedFrom: Self = this.set("inheritedFrom", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionType(value: String): Self = this.set("teamDrivePermissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDrivePermissionType: Self = this.set("teamDrivePermissionType", js.undefined)
  }
}
