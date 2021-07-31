package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleAssignment
  extends StObject
     with Entity {
  
  // Description of the Role Assignment.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display or friendly name of the role Assignment.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of ids of role scope member security groups. These are IDs from Azure Active Directory.
  var resourceScopes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Role definition this assignment is part of.
  var roleDefinition: js.UndefOr[NullableOption[RoleDefinition]] = js.undefined
}
object RoleAssignment {
  
  @scala.inline
  def apply(): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssignment]
  }
  
  @scala.inline
  implicit class RoleAssignmentMutableBuilder[Self <: RoleAssignment] (val x: Self) extends AnyVal {
    
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
    def setResourceScopes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "resourceScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceScopesNull: Self = StObject.set(x, "resourceScopes", null)
    
    @scala.inline
    def setResourceScopesUndefined: Self = StObject.set(x, "resourceScopes", js.undefined)
    
    @scala.inline
    def setResourceScopesVarargs(value: String*): Self = StObject.set(x, "resourceScopes", js.Array(value :_*))
    
    @scala.inline
    def setRoleDefinition(value: NullableOption[RoleDefinition]): Self = StObject.set(x, "roleDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleDefinitionNull: Self = StObject.set(x, "roleDefinition", null)
    
    @scala.inline
    def setRoleDefinitionUndefined: Self = StObject.set(x, "roleDefinition", js.undefined)
  }
}
