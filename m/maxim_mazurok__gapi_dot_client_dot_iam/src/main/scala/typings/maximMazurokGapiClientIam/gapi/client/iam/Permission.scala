package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends js.Object {
  
  /** The service API associated with the permission is not enabled. */
  var apiDisabled: js.UndefOr[Boolean] = js.native
  
  /** The current custom role support level. */
  var customRolesSupportLevel: js.UndefOr[String] = js.native
  
  /** A brief description of what this Permission is used for. This permission can ONLY be used in predefined roles. */
  var description: js.UndefOr[String] = js.native
  
  /** The name of this Permission. */
  var name: js.UndefOr[String] = js.native
  
  var onlyInPredefinedRoles: js.UndefOr[Boolean] = js.native
  
  /** The preferred name for this permission. If present, then this permission is an alias of, and equivalent to, the listed primary_permission. */
  var primaryPermission: js.UndefOr[String] = js.native
  
  /** The current launch stage of the permission. */
  var stage: js.UndefOr[String] = js.native
  
  /** The title of this Permission. */
  var title: js.UndefOr[String] = js.native
}
object Permission {
  
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    
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
    def setApiDisabled(value: Boolean): Self = this.set("apiDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiDisabled: Self = this.set("apiDisabled", js.undefined)
    
    @scala.inline
    def setCustomRolesSupportLevel(value: String): Self = this.set("customRolesSupportLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRolesSupportLevel: Self = this.set("customRolesSupportLevel", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnlyInPredefinedRoles(value: Boolean): Self = this.set("onlyInPredefinedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyInPredefinedRoles: Self = this.set("onlyInPredefinedRoles", js.undefined)
    
    @scala.inline
    def setPrimaryPermission(value: String): Self = this.set("primaryPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryPermission: Self = this.set("primaryPermission", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
