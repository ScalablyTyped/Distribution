package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleDefinition extends Entity {
  
  // Description of the Role definition.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Display Name of the Role definition.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
  var isBuiltIn: js.UndefOr[Boolean] = js.native
  
  // List of Role assignments for this role definition.
  var roleAssignments: js.UndefOr[NullableOption[js.Array[RoleAssignment]]] = js.native
  
  /**
    * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of
    * the rolePermission.
    */
  var rolePermissions: js.UndefOr[NullableOption[js.Array[RolePermission]]] = js.native
}
object RoleDefinition {
  
  @scala.inline
  def apply(): RoleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDefinition]
  }
  
  @scala.inline
  implicit class RoleDefinitionMutableBuilder[Self <: RoleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = StObject.set(x, "isBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltInUndefined: Self = StObject.set(x, "isBuiltIn", js.undefined)
    
    @scala.inline
    def setRoleAssignments(value: NullableOption[js.Array[RoleAssignment]]): Self = StObject.set(x, "roleAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAssignmentsNull: Self = StObject.set(x, "roleAssignments", null)
    
    @scala.inline
    def setRoleAssignmentsUndefined: Self = StObject.set(x, "roleAssignments", js.undefined)
    
    @scala.inline
    def setRoleAssignmentsVarargs(value: RoleAssignment*): Self = StObject.set(x, "roleAssignments", js.Array(value :_*))
    
    @scala.inline
    def setRolePermissions(value: NullableOption[js.Array[RolePermission]]): Self = StObject.set(x, "rolePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolePermissionsNull: Self = StObject.set(x, "rolePermissions", null)
    
    @scala.inline
    def setRolePermissionsUndefined: Self = StObject.set(x, "rolePermissions", js.undefined)
    
    @scala.inline
    def setRolePermissionsVarargs(value: RolePermission*): Self = StObject.set(x, "rolePermissions", js.Array(value :_*))
  }
}
