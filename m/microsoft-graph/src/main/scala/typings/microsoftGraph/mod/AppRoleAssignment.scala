package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppRoleAssignment extends DirectoryObject {
  
  /**
    * The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles
    * property on the resource application's service principal (resourceId). If the resource application has not declared any
    * app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal
    * is assigned to the resource app without any specific app roles. Required on create. Does not support $filter.
    */
  var appRoleId: js.UndefOr[String] = js.native
  
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports
    * $filter (eq and startswith).
    */
  var principalDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The unique identifier (id) for the user, group or service principal being granted the app role. Required on create.
    * Does not support $filter.
    */
  var principalId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The type of the assigned principal. This can either be 'User', 'Group' or 'ServicePrincipal'. Read-only. Does not
    * support $filter.
    */
  var principalType: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name of the resource app's service principal to which the assignment is made. Does not support $filter.
  var resourceDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The unique identifier (id) for the resource service principal for which the assignment is made. Required on create.
    * Supports $filter (eq only).
    */
  var resourceId: js.UndefOr[NullableOption[String]] = js.native
}
object AppRoleAssignment {
  
  @scala.inline
  def apply(): AppRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRoleAssignment]
  }
  
  @scala.inline
  implicit class AppRoleAssignmentOps[Self <: AppRoleAssignment] (val x: Self) extends AnyVal {
    
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
    def setAppRoleId(value: String): Self = this.set("appRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppRoleId: Self = this.set("appRoleId", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setPrincipalDisplayName(value: NullableOption[String]): Self = this.set("principalDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalDisplayName: Self = this.set("principalDisplayName", js.undefined)
    
    @scala.inline
    def setPrincipalDisplayNameNull: Self = this.set("principalDisplayName", null)
    
    @scala.inline
    def setPrincipalId(value: NullableOption[String]): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    
    @scala.inline
    def setPrincipalIdNull: Self = this.set("principalId", null)
    
    @scala.inline
    def setPrincipalType(value: NullableOption[String]): Self = this.set("principalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalType: Self = this.set("principalType", js.undefined)
    
    @scala.inline
    def setPrincipalTypeNull: Self = this.set("principalType", null)
    
    @scala.inline
    def setResourceDisplayName(value: NullableOption[String]): Self = this.set("resourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDisplayName: Self = this.set("resourceDisplayName", js.undefined)
    
    @scala.inline
    def setResourceDisplayNameNull: Self = this.set("resourceDisplayName", null)
    
    @scala.inline
    def setResourceId(value: NullableOption[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceIdNull: Self = this.set("resourceId", null)
  }
}
