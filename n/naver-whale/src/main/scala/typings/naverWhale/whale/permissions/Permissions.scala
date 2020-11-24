package typings.naverWhale.whale.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permissions extends js.Object {
  
  /**
    * Optional.
    * List of origin permissions. Anything listed here must be a subset of a host that appears in the optional_permissions list in the manifest. For example, if http:// *.example.com/ or http:// * appears in optional_permissions, you can request an origin of http://help.example.com/. Any path is ignored.
    */
  var origins: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.
    * List of named permissions (does not include hosts or origins). Anything listed here must appear in the optional_permissions list in the manifest.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object Permissions {
  
  @scala.inline
  def apply(): Permissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
    
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
    def setOriginsVarargs(value: String*): Self = this.set("origins", js.Array(value :_*))
    
    @scala.inline
    def setOrigins(value: js.Array[String]): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
}
