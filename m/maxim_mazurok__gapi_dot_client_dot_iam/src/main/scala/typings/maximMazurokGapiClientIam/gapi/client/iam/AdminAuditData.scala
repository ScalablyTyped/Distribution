package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminAuditData extends js.Object {
  
  /** The permission_delta when when creating or updating a Role. */
  var permissionDelta: js.UndefOr[PermissionDelta] = js.native
}
object AdminAuditData {
  
  @scala.inline
  def apply(): AdminAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAuditData]
  }
  
  @scala.inline
  implicit class AdminAuditDataOps[Self <: AdminAuditData] (val x: Self) extends AnyVal {
    
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
    def setPermissionDelta(value: PermissionDelta): Self = this.set("permissionDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionDelta: Self = this.set("permissionDelta", js.undefined)
  }
}
