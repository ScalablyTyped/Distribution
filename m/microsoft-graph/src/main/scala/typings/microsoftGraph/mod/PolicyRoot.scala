package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyRoot
  extends StObject
     with Entity {
  
  var activityBasedTimeoutPolicies: js.UndefOr[NullableOption[js.Array[ActivityBasedTimeoutPolicy]]] = js.undefined
  
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.undefined
  
  var conditionalAccessPolicies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
  
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.undefined
  
  var identitySecurityDefaultsEnforcementPolicy: js.UndefOr[NullableOption[IdentitySecurityDefaultsEnforcementPolicy]] = js.undefined
  
  var permissionGrantPolicies: js.UndefOr[NullableOption[js.Array[PermissionGrantPolicy]]] = js.undefined
  
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.undefined
  
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.undefined
}
object PolicyRoot {
  
  inline def apply(): PolicyRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRoot]
  }
  
  extension [Self <: PolicyRoot](x: Self) {
    
    inline def setActivityBasedTimeoutPolicies(value: NullableOption[js.Array[ActivityBasedTimeoutPolicy]]): Self = StObject.set(x, "activityBasedTimeoutPolicies", value.asInstanceOf[js.Any])
    
    inline def setActivityBasedTimeoutPoliciesNull: Self = StObject.set(x, "activityBasedTimeoutPolicies", null)
    
    inline def setActivityBasedTimeoutPoliciesUndefined: Self = StObject.set(x, "activityBasedTimeoutPolicies", js.undefined)
    
    inline def setActivityBasedTimeoutPoliciesVarargs(value: ActivityBasedTimeoutPolicy*): Self = StObject.set(x, "activityBasedTimeoutPolicies", js.Array(value :_*))
    
    inline def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = StObject.set(x, "claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    inline def setClaimsMappingPoliciesNull: Self = StObject.set(x, "claimsMappingPolicies", null)
    
    inline def setClaimsMappingPoliciesUndefined: Self = StObject.set(x, "claimsMappingPolicies", js.undefined)
    
    inline def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = StObject.set(x, "claimsMappingPolicies", js.Array(value :_*))
    
    inline def setConditionalAccessPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "conditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessPoliciesNull: Self = StObject.set(x, "conditionalAccessPolicies", null)
    
    inline def setConditionalAccessPoliciesUndefined: Self = StObject.set(x, "conditionalAccessPolicies", js.undefined)
    
    inline def setConditionalAccessPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "conditionalAccessPolicies", js.Array(value :_*))
    
    inline def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    inline def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    inline def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    inline def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    inline def setIdentitySecurityDefaultsEnforcementPolicy(value: NullableOption[IdentitySecurityDefaultsEnforcementPolicy]): Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", value.asInstanceOf[js.Any])
    
    inline def setIdentitySecurityDefaultsEnforcementPolicyNull: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", null)
    
    inline def setIdentitySecurityDefaultsEnforcementPolicyUndefined: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", js.undefined)
    
    inline def setPermissionGrantPolicies(value: NullableOption[js.Array[PermissionGrantPolicy]]): Self = StObject.set(x, "permissionGrantPolicies", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantPoliciesNull: Self = StObject.set(x, "permissionGrantPolicies", null)
    
    inline def setPermissionGrantPoliciesUndefined: Self = StObject.set(x, "permissionGrantPolicies", js.undefined)
    
    inline def setPermissionGrantPoliciesVarargs(value: PermissionGrantPolicy*): Self = StObject.set(x, "permissionGrantPolicies", js.Array(value :_*))
    
    inline def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    inline def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    inline def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value :_*))
    
    inline def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    inline def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    inline def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value :_*))
  }
}
