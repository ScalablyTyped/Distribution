package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionDelta extends js.Object {
  
  /** Added permissions. */
  var addedPermissions: js.UndefOr[js.Array[String]] = js.native
  
  /** Removed permissions. */
  var removedPermissions: js.UndefOr[js.Array[String]] = js.native
}
object PermissionDelta {
  
  @scala.inline
  def apply(): PermissionDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionDelta]
  }
  
  @scala.inline
  implicit class PermissionDeltaOps[Self <: PermissionDelta] (val x: Self) extends AnyVal {
    
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
    def setAddedPermissionsVarargs(value: String*): Self = this.set("addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setAddedPermissions(value: js.Array[String]): Self = this.set("addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedPermissions: Self = this.set("addedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: String*): Self = this.set("removedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[String]): Self = this.set("removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedPermissions: Self = this.set("removedPermissions", js.undefined)
  }
}
