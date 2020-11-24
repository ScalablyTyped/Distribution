package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inherited extends js.Object {
  
  /** Whether this permission is inherited. This field is always populated. This is an output-only field. */
  var inherited: js.UndefOr[Boolean] = js.native
  
  /** The ID of the item from which this permission is inherited. This is an output-only field. */
  var inheritedFrom: js.UndefOr[String] = js.native
  
  /**
    * The permission type for this user. While new values may be added in future, the following are currently possible:
    * - file
    * - member
    */
  var permissionType: js.UndefOr[String] = js.native
  
  /**
    * The primary role for this user. While new values may be added in the future, the following are currently possible:
    * - organizer
    * - fileOrganizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.native
}
object Inherited {
  
  @scala.inline
  def apply(): Inherited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherited]
  }
  
  @scala.inline
  implicit class InheritedOps[Self <: Inherited] (val x: Self) extends AnyVal {
    
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
    def setPermissionType(value: String): Self = this.set("permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionType: Self = this.set("permissionType", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
