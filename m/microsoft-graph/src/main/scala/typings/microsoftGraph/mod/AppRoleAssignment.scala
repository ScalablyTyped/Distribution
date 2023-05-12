package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRoleAssignment
  extends StObject
     with DirectoryObject {
  
  /**
    * The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles
    * property on the resource application's service principal (resourceId). If the resource application has not declared any
    * app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal
    * is assigned to the resource app without any specific app roles. Required on create.
    */
  var appRoleId: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the app role assignment was created. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports
    * $filter (eq and startswith).
    */
  var principalDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The unique identifier (id) for the user, security group, or service principal being granted the app role. Security
    * groups with dynamic memberships are supported. Required on create.
    */
  var principalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
  var principalType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the resource app's service principal to which the assignment is made.
  var resourceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The unique identifier (id) for the resource service principal for which the assignment is made. Required on create.
    * Supports $filter (eq only).
    */
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AppRoleAssignment {
  
  inline def apply(): AppRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRoleAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRoleAssignment] (val x: Self) extends AnyVal {
    
    inline def setAppRoleId(value: String): Self = StObject.set(x, "appRoleId", value.asInstanceOf[js.Any])
    
    inline def setAppRoleIdUndefined: Self = StObject.set(x, "appRoleId", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setPrincipalDisplayName(value: NullableOption[String]): Self = StObject.set(x, "principalDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPrincipalDisplayNameNull: Self = StObject.set(x, "principalDisplayName", null)
    
    inline def setPrincipalDisplayNameUndefined: Self = StObject.set(x, "principalDisplayName", js.undefined)
    
    inline def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setPrincipalType(value: NullableOption[String]): Self = StObject.set(x, "principalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeNull: Self = StObject.set(x, "principalType", null)
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "principalType", js.undefined)
    
    inline def setResourceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "resourceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceDisplayNameNull: Self = StObject.set(x, "resourceDisplayName", null)
    
    inline def setResourceDisplayNameUndefined: Self = StObject.set(x, "resourceDisplayName", js.undefined)
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
