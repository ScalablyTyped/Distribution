package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyRoot extends Entity {
  
  var activityBasedTimeoutPolicies: js.UndefOr[NullableOption[js.Array[ActivityBasedTimeoutPolicy]]] = js.native
  
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.native
  
  var conditionalAccessPolicies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.native
  
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.native
  
  var identitySecurityDefaultsEnforcementPolicy: js.UndefOr[NullableOption[IdentitySecurityDefaultsEnforcementPolicy]] = js.native
  
  var permissionGrantPolicies: js.UndefOr[NullableOption[js.Array[PermissionGrantPolicy]]] = js.native
  
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.native
  
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.native
}
object PolicyRoot {
  
  @scala.inline
  def apply(): PolicyRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRoot]
  }
  
  @scala.inline
  implicit class PolicyRootOps[Self <: PolicyRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityBasedTimeoutPoliciesVarargs(value: ActivityBasedTimeoutPolicy*): Self = this.set("activityBasedTimeoutPolicies", js.Array(value :_*))
    
    @scala.inline
    def setActivityBasedTimeoutPolicies(value: NullableOption[js.Array[ActivityBasedTimeoutPolicy]]): Self = this.set("activityBasedTimeoutPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityBasedTimeoutPolicies: Self = this.set("activityBasedTimeoutPolicies", js.undefined)
    
    @scala.inline
    def setActivityBasedTimeoutPoliciesNull: Self = this.set("activityBasedTimeoutPolicies", null)
    
    @scala.inline
    def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = this.set("claimsMappingPolicies", js.Array(value :_*))
    
    @scala.inline
    def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = this.set("claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsMappingPolicies: Self = this.set("claimsMappingPolicies", js.undefined)
    
    @scala.inline
    def setClaimsMappingPoliciesNull: Self = this.set("claimsMappingPolicies", null)
    
    @scala.inline
    def setConditionalAccessPoliciesVarargs(value: ConditionalAccessPolicy*): Self = this.set("conditionalAccessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setConditionalAccessPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = this.set("conditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalAccessPolicies: Self = this.set("conditionalAccessPolicies", js.undefined)
    
    @scala.inline
    def setConditionalAccessPoliciesNull: Self = this.set("conditionalAccessPolicies", null)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = this.set("homeRealmDiscoveryPolicies", js.Array(value :_*))
    
    @scala.inline
    def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = this.set("homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRealmDiscoveryPolicies: Self = this.set("homeRealmDiscoveryPolicies", js.undefined)
    
    @scala.inline
    def setHomeRealmDiscoveryPoliciesNull: Self = this.set("homeRealmDiscoveryPolicies", null)
    
    @scala.inline
    def setIdentitySecurityDefaultsEnforcementPolicy(value: NullableOption[IdentitySecurityDefaultsEnforcementPolicy]): Self = this.set("identitySecurityDefaultsEnforcementPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySecurityDefaultsEnforcementPolicy: Self = this.set("identitySecurityDefaultsEnforcementPolicy", js.undefined)
    
    @scala.inline
    def setIdentitySecurityDefaultsEnforcementPolicyNull: Self = this.set("identitySecurityDefaultsEnforcementPolicy", null)
    
    @scala.inline
    def setPermissionGrantPoliciesVarargs(value: PermissionGrantPolicy*): Self = this.set("permissionGrantPolicies", js.Array(value :_*))
    
    @scala.inline
    def setPermissionGrantPolicies(value: NullableOption[js.Array[PermissionGrantPolicy]]): Self = this.set("permissionGrantPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGrantPolicies: Self = this.set("permissionGrantPolicies", js.undefined)
    
    @scala.inline
    def setPermissionGrantPoliciesNull: Self = this.set("permissionGrantPolicies", null)
    
    @scala.inline
    def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = this.set("tokenIssuancePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = this.set("tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenIssuancePolicies: Self = this.set("tokenIssuancePolicies", js.undefined)
    
    @scala.inline
    def setTokenIssuancePoliciesNull: Self = this.set("tokenIssuancePolicies", null)
    
    @scala.inline
    def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = this.set("tokenLifetimePolicies", js.Array(value :_*))
    
    @scala.inline
    def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = this.set("tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenLifetimePolicies: Self = this.set("tokenLifetimePolicies", js.undefined)
    
    @scala.inline
    def setTokenLifetimePoliciesNull: Self = this.set("tokenLifetimePolicies", null)
  }
}
