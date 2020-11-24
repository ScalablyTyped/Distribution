package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAuthorizedApplication extends js.Object {
  
  // The unique identifier for the application.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the oauth2PermissionScopes the application requires.
  var delegatedPermissionIds: js.UndefOr[js.Array[String]] = js.native
}
object PreAuthorizedApplication {
  
  @scala.inline
  def apply(): PreAuthorizedApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreAuthorizedApplication]
  }
  
  @scala.inline
  implicit class PreAuthorizedApplicationOps[Self <: PreAuthorizedApplication] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setDelegatedPermissionIdsVarargs(value: String*): Self = this.set("delegatedPermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setDelegatedPermissionIds(value: js.Array[String]): Self = this.set("delegatedPermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedPermissionIds: Self = this.set("delegatedPermissionIds", js.undefined)
  }
}
