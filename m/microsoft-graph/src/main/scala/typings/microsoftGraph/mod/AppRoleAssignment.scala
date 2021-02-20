package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class AppRoleAssignmentMutableBuilder[Self <: AppRoleAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppRoleId(value: String): Self = StObject.set(x, "appRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppRoleIdUndefined: Self = StObject.set(x, "appRoleId", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setPrincipalDisplayName(value: NullableOption[String]): Self = StObject.set(x, "principalDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalDisplayNameNull: Self = StObject.set(x, "principalDisplayName", null)
    
    @scala.inline
    def setPrincipalDisplayNameUndefined: Self = StObject.set(x, "principalDisplayName", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: NullableOption[String]): Self = StObject.set(x, "principalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalTypeNull: Self = StObject.set(x, "principalType", null)
    
    @scala.inline
    def setPrincipalTypeUndefined: Self = StObject.set(x, "principalType", js.undefined)
    
    @scala.inline
    def setResourceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "resourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDisplayNameNull: Self = StObject.set(x, "resourceDisplayName", null)
    
    @scala.inline
    def setResourceDisplayNameUndefined: Self = StObject.set(x, "resourceDisplayName", js.undefined)
    
    @scala.inline
    def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
