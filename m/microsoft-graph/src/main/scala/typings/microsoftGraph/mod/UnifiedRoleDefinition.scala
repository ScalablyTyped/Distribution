package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleDefinition
  extends StObject
     with Entity {
  
  // The description for the unifiedRoleDefinition. Read-only when isBuiltIn is true.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the unifiedRoleDefinition. Read-only when isBuiltIn is true. Required. Supports $filter (eq, in).
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Read-only collection of role definitions that the given role definition inherits from. Only Azure AD built-in roles
    * (isBuiltIn is true) support this attribute. Supports $expand.
    */
  var inheritsPermissionsFrom: js.UndefOr[NullableOption[js.Array[UnifiedRoleDefinition]]] = js.undefined
  
  /**
    * Flag indicating whether the role definition is part of the default set included in Azure Active Directory (Azure AD) or
    * a custom definition. Read-only. Supports $filter (eq, in).
    */
  var isBuiltIn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Flag indicating whether the role is enabled for assignment. If false the role is not available for assignment.
    * Read-only when isBuiltIn is true.
    */
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * List of the scopes or permissions the role definition applies to. Currently only / is supported. Read-only when
    * isBuiltIn is true. DO NOT USE. This will be deprecated soon. Attach scope to role assignment.
    */
  var resourceScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  // List of permissions included in the role. Read-only when isBuiltIn is true. Required.
  var rolePermissions: js.UndefOr[js.Array[UnifiedRolePermission]] = js.undefined
  
  /**
    * Custom template identifier that can be set when isBuiltIn is false but is read-only when isBuiltIn is true. This
    * identifier is typically used if one needs an identifier to be the same across different directories.
    */
  var templateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates version of the role definition. Read-only when isBuiltIn is true.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleDefinition {
  
  inline def apply(): UnifiedRoleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleDefinition] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInheritsPermissionsFrom(value: NullableOption[js.Array[UnifiedRoleDefinition]]): Self = StObject.set(x, "inheritsPermissionsFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritsPermissionsFromNull: Self = StObject.set(x, "inheritsPermissionsFrom", null)
    
    inline def setInheritsPermissionsFromUndefined: Self = StObject.set(x, "inheritsPermissionsFrom", js.undefined)
    
    inline def setInheritsPermissionsFromVarargs(value: UnifiedRoleDefinition*): Self = StObject.set(x, "inheritsPermissionsFrom", js.Array(value*))
    
    inline def setIsBuiltIn(value: NullableOption[Boolean]): Self = StObject.set(x, "isBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltInNull: Self = StObject.set(x, "isBuiltIn", null)
    
    inline def setIsBuiltInUndefined: Self = StObject.set(x, "isBuiltIn", js.undefined)
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setResourceScopes(value: js.Array[String]): Self = StObject.set(x, "resourceScopes", value.asInstanceOf[js.Any])
    
    inline def setResourceScopesUndefined: Self = StObject.set(x, "resourceScopes", js.undefined)
    
    inline def setResourceScopesVarargs(value: String*): Self = StObject.set(x, "resourceScopes", js.Array(value*))
    
    inline def setRolePermissions(value: js.Array[UnifiedRolePermission]): Self = StObject.set(x, "rolePermissions", value.asInstanceOf[js.Any])
    
    inline def setRolePermissionsUndefined: Self = StObject.set(x, "rolePermissions", js.undefined)
    
    inline def setRolePermissionsVarargs(value: UnifiedRolePermission*): Self = StObject.set(x, "rolePermissions", js.Array(value*))
    
    inline def setTemplateId(value: NullableOption[String]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
