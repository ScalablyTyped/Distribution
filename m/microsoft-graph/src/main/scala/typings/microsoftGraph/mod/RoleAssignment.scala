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
  
  inline def apply(): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssignment]
  }
  
  extension [Self <: RoleAssignment](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResourceScopes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "resourceScopes", value.asInstanceOf[js.Any])
    
    inline def setResourceScopesNull: Self = StObject.set(x, "resourceScopes", null)
    
    inline def setResourceScopesUndefined: Self = StObject.set(x, "resourceScopes", js.undefined)
    
    inline def setResourceScopesVarargs(value: String*): Self = StObject.set(x, "resourceScopes", js.Array(value :_*))
    
    inline def setRoleDefinition(value: NullableOption[RoleDefinition]): Self = StObject.set(x, "roleDefinition", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionNull: Self = StObject.set(x, "roleDefinition", null)
    
    inline def setRoleDefinitionUndefined: Self = StObject.set(x, "roleDefinition", js.undefined)
  }
}
