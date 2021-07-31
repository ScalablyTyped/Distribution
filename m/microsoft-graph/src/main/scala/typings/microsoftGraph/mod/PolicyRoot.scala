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
  
  @scala.inline
  def apply(): PolicyRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRoot]
  }
  
  @scala.inline
  implicit class PolicyRootMutableBuilder[Self <: PolicyRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityBasedTimeoutPolicies(value: NullableOption[js.Array[ActivityBasedTimeoutPolicy]]): Self = StObject.set(x, "activityBasedTimeoutPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityBasedTimeoutPoliciesNull: Self = StObject.set(x, "activityBasedTimeoutPolicies", null)
    
    @scala.inline
    def setActivityBasedTimeoutPoliciesUndefined: Self = StObject.set(x, "activityBasedTimeoutPolicies", js.undefined)
    
    @scala.inline
    def setActivityBasedTimeoutPoliciesVarargs(value: ActivityBasedTimeoutPolicy*): Self = StObject.set(x, "activityBasedTimeoutPolicies", js.Array(value :_*))
    
    @scala.inline
    def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = StObject.set(x, "claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsMappingPoliciesNull: Self = StObject.set(x, "claimsMappingPolicies", null)
    
    @scala.inline
    def setClaimsMappingPoliciesUndefined: Self = StObject.set(x, "claimsMappingPolicies", js.undefined)
    
    @scala.inline
    def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = StObject.set(x, "claimsMappingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setConditionalAccessPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "conditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalAccessPoliciesNull: Self = StObject.set(x, "conditionalAccessPolicies", null)
    
    @scala.inline
    def setConditionalAccessPoliciesUndefined: Self = StObject.set(x, "conditionalAccessPolicies", js.undefined)
    
    @scala.inline
    def setConditionalAccessPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "conditionalAccessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setIdentitySecurityDefaultsEnforcementPolicy(value: NullableOption[IdentitySecurityDefaultsEnforcementPolicy]): Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySecurityDefaultsEnforcementPolicyNull: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", null)
    
    @scala.inline
    def setIdentitySecurityDefaultsEnforcementPolicyUndefined: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", js.undefined)
    
    @scala.inline
    def setPermissionGrantPolicies(value: NullableOption[js.Array[PermissionGrantPolicy]]): Self = StObject.set(x, "permissionGrantPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionGrantPoliciesNull: Self = StObject.set(x, "permissionGrantPolicies", null)
    
    @scala.inline
    def setPermissionGrantPoliciesUndefined: Self = StObject.set(x, "permissionGrantPolicies", js.undefined)
    
    @scala.inline
    def setPermissionGrantPoliciesVarargs(value: PermissionGrantPolicy*): Self = StObject.set(x, "permissionGrantPolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    @scala.inline
    def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    @scala.inline
    def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value :_*))
  }
}
