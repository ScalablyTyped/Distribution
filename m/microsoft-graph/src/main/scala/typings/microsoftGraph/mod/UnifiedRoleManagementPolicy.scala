package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicy
  extends StObject
     with Entity {
  
  // Description for the policy.
  var description: js.UndefOr[String] = js.undefined
  
  // Display name for the policy.
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For
    * example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable
    * approval even if the policy has a rule to disable approval. Supports $expand.
    */
  var effectiveRules: js.UndefOr[NullableOption[js.Array[UnifiedRoleManagementPolicyRule]]] = js.undefined
  
  /**
    * This can only be set to true for a single tenant-wide policy which will apply to all scopes and roles. Set the scopeId
    * to / and scopeType to Directory. Supports $filter (eq, ne).
    */
  var isOrganizationDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The identity who last modified the role setting.
  var lastModifiedBy: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // The time when the role setting was last modified.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of rules like approval rules and expiration rules. Supports $expand.
  var rules: js.UndefOr[NullableOption[js.Array[UnifiedRoleManagementPolicyRule]]] = js.undefined
  
  // The identifier of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
  var scopeId: js.UndefOr[String] = js.undefined
  
  // The type of the scope where the policy is created. One of Directory, DirectoryRole. Required.
  var scopeType: js.UndefOr[String] = js.undefined
}
object UnifiedRoleManagementPolicy {
  
  inline def apply(): UnifiedRoleManagementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicy]
  }
  
  extension [Self <: UnifiedRoleManagementPolicy](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEffectiveRules(value: NullableOption[js.Array[UnifiedRoleManagementPolicyRule]]): Self = StObject.set(x, "effectiveRules", value.asInstanceOf[js.Any])
    
    inline def setEffectiveRulesNull: Self = StObject.set(x, "effectiveRules", null)
    
    inline def setEffectiveRulesUndefined: Self = StObject.set(x, "effectiveRules", js.undefined)
    
    inline def setEffectiveRulesVarargs(value: UnifiedRoleManagementPolicyRule*): Self = StObject.set(x, "effectiveRules", js.Array(value*))
    
    inline def setIsOrganizationDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isOrganizationDefault", value.asInstanceOf[js.Any])
    
    inline def setIsOrganizationDefaultNull: Self = StObject.set(x, "isOrganizationDefault", null)
    
    inline def setIsOrganizationDefaultUndefined: Self = StObject.set(x, "isOrganizationDefault", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[Identity]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setRules(value: NullableOption[js.Array[UnifiedRoleManagementPolicyRule]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesNull: Self = StObject.set(x, "rules", null)
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: UnifiedRoleManagementPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    inline def setScopeType(value: String): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    inline def setScopeTypeUndefined: Self = StObject.set(x, "scopeType", js.undefined)
  }
}
