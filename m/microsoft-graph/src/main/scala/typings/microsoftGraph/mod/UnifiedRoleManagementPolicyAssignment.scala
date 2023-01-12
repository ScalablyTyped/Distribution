package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyAssignment
  extends StObject
     with Entity {
  
  /**
    * The policy that's associated with a policy assignment. Supports $expand and a nested $expand of the rules and
    * effectiveRules relationships for the policy.
    */
  var policy: js.UndefOr[NullableOption[UnifiedRoleManagementPolicy]] = js.undefined
  
  // The id of the policy. Inherited from entity.
  var policyId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the role definition object where the policy applies. If not specified, the policy applies to all
    * roles. Supports $filter (eq).
    */
  var roleDefinitionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the scope where the policy is assigned. Can be / for the tenant or a group ID. Required.
  var scopeId: js.UndefOr[String] = js.undefined
  
  // The type of the scope where the policy is assigned. One of Directory, DirectoryRole. Required.
  var scopeType: js.UndefOr[String] = js.undefined
}
object UnifiedRoleManagementPolicyAssignment {
  
  inline def apply(): UnifiedRoleManagementPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleManagementPolicyAssignment] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: NullableOption[UnifiedRoleManagementPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: String): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRoleDefinitionId(value: NullableOption[String]): Self = StObject.set(x, "roleDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionIdNull: Self = StObject.set(x, "roleDefinitionId", null)
    
    inline def setRoleDefinitionIdUndefined: Self = StObject.set(x, "roleDefinitionId", js.undefined)
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    inline def setScopeType(value: String): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    inline def setScopeTypeUndefined: Self = StObject.set(x, "scopeType", js.undefined)
  }
}
