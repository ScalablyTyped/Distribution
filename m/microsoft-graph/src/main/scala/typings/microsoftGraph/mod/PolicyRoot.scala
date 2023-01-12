package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyRoot
  extends StObject
     with Entity {
  
  // The policy that controls the idle time out for web sessions for applications.
  var activityBasedTimeoutPolicies: js.UndefOr[NullableOption[js.Array[ActivityBasedTimeoutPolicy]]] = js.undefined
  
  // The policy by which consent requests are created and managed for the entire tenant.
  var adminConsentRequestPolicy: js.UndefOr[NullableOption[AdminConsentRequestPolicy]] = js.undefined
  
  // The policy configuration of the self-service sign-up experience of external users.
  var authenticationFlowsPolicy: js.UndefOr[NullableOption[AuthenticationFlowsPolicy]] = js.undefined
  
  /**
    * The authentication methods and the users that are allowed to use them to sign in and perform multi-factor
    * authentication (MFA) in Azure Active Directory (Azure AD).
    */
  var authenticationMethodsPolicy: js.UndefOr[NullableOption[AuthenticationMethodsPolicy]] = js.undefined
  
  // The policy that controls Azure AD authorization settings.
  var authorizationPolicy: js.UndefOr[NullableOption[AuthorizationPolicy]] = js.undefined
  
  /**
    * The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific
    * application.
    */
  var claimsMappingPolicies: js.UndefOr[NullableOption[js.Array[ClaimsMappingPolicy]]] = js.undefined
  
  // The custom rules that define an access scenario.
  var conditionalAccessPolicies: js.UndefOr[NullableOption[js.Array[ConditionalAccessPolicy]]] = js.undefined
  
  // The custom rules that define an access scenario when interacting with external Azure AD tenants.
  var crossTenantAccessPolicy: js.UndefOr[NullableOption[CrossTenantAccessPolicy]] = js.undefined
  
  // The feature rollout policy associated with a directory object.
  var featureRolloutPolicies: js.UndefOr[NullableOption[js.Array[FeatureRolloutPolicy]]] = js.undefined
  
  // The policy to control Azure AD authentication behavior for federated users.
  var homeRealmDiscoveryPolicies: js.UndefOr[NullableOption[js.Array[HomeRealmDiscoveryPolicy]]] = js.undefined
  
  // The policy that represents the security defaults that protect against common attacks.
  var identitySecurityDefaultsEnforcementPolicy: js.UndefOr[NullableOption[IdentitySecurityDefaultsEnforcementPolicy]] = js.undefined
  
  // The policy that specifies the conditions under which consent can be granted.
  var permissionGrantPolicies: js.UndefOr[NullableOption[js.Array[PermissionGrantPolicy]]] = js.undefined
  
  // Specifies the various policies associated with scopes and roles.
  var roleManagementPolicies: js.UndefOr[NullableOption[js.Array[UnifiedRoleManagementPolicy]]] = js.undefined
  
  // The assignment of a role management policy to a role definition object.
  var roleManagementPolicyAssignments: js.UndefOr[NullableOption[js.Array[UnifiedRoleManagementPolicyAssignment]]] = js.undefined
  
  // The policy that specifies the characteristics of SAML tokens issued by Azure AD.
  var tokenIssuancePolicies: js.UndefOr[NullableOption[js.Array[TokenIssuancePolicy]]] = js.undefined
  
  // The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
  var tokenLifetimePolicies: js.UndefOr[NullableOption[js.Array[TokenLifetimePolicy]]] = js.undefined
}
object PolicyRoot {
  
  inline def apply(): PolicyRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyRoot] (val x: Self) extends AnyVal {
    
    inline def setActivityBasedTimeoutPolicies(value: NullableOption[js.Array[ActivityBasedTimeoutPolicy]]): Self = StObject.set(x, "activityBasedTimeoutPolicies", value.asInstanceOf[js.Any])
    
    inline def setActivityBasedTimeoutPoliciesNull: Self = StObject.set(x, "activityBasedTimeoutPolicies", null)
    
    inline def setActivityBasedTimeoutPoliciesUndefined: Self = StObject.set(x, "activityBasedTimeoutPolicies", js.undefined)
    
    inline def setActivityBasedTimeoutPoliciesVarargs(value: ActivityBasedTimeoutPolicy*): Self = StObject.set(x, "activityBasedTimeoutPolicies", js.Array(value*))
    
    inline def setAdminConsentRequestPolicy(value: NullableOption[AdminConsentRequestPolicy]): Self = StObject.set(x, "adminConsentRequestPolicy", value.asInstanceOf[js.Any])
    
    inline def setAdminConsentRequestPolicyNull: Self = StObject.set(x, "adminConsentRequestPolicy", null)
    
    inline def setAdminConsentRequestPolicyUndefined: Self = StObject.set(x, "adminConsentRequestPolicy", js.undefined)
    
    inline def setAuthenticationFlowsPolicy(value: NullableOption[AuthenticationFlowsPolicy]): Self = StObject.set(x, "authenticationFlowsPolicy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationFlowsPolicyNull: Self = StObject.set(x, "authenticationFlowsPolicy", null)
    
    inline def setAuthenticationFlowsPolicyUndefined: Self = StObject.set(x, "authenticationFlowsPolicy", js.undefined)
    
    inline def setAuthenticationMethodsPolicy(value: NullableOption[AuthenticationMethodsPolicy]): Self = StObject.set(x, "authenticationMethodsPolicy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodsPolicyNull: Self = StObject.set(x, "authenticationMethodsPolicy", null)
    
    inline def setAuthenticationMethodsPolicyUndefined: Self = StObject.set(x, "authenticationMethodsPolicy", js.undefined)
    
    inline def setAuthorizationPolicy(value: NullableOption[AuthorizationPolicy]): Self = StObject.set(x, "authorizationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPolicyNull: Self = StObject.set(x, "authorizationPolicy", null)
    
    inline def setAuthorizationPolicyUndefined: Self = StObject.set(x, "authorizationPolicy", js.undefined)
    
    inline def setClaimsMappingPolicies(value: NullableOption[js.Array[ClaimsMappingPolicy]]): Self = StObject.set(x, "claimsMappingPolicies", value.asInstanceOf[js.Any])
    
    inline def setClaimsMappingPoliciesNull: Self = StObject.set(x, "claimsMappingPolicies", null)
    
    inline def setClaimsMappingPoliciesUndefined: Self = StObject.set(x, "claimsMappingPolicies", js.undefined)
    
    inline def setClaimsMappingPoliciesVarargs(value: ClaimsMappingPolicy*): Self = StObject.set(x, "claimsMappingPolicies", js.Array(value*))
    
    inline def setConditionalAccessPolicies(value: NullableOption[js.Array[ConditionalAccessPolicy]]): Self = StObject.set(x, "conditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessPoliciesNull: Self = StObject.set(x, "conditionalAccessPolicies", null)
    
    inline def setConditionalAccessPoliciesUndefined: Self = StObject.set(x, "conditionalAccessPolicies", js.undefined)
    
    inline def setConditionalAccessPoliciesVarargs(value: ConditionalAccessPolicy*): Self = StObject.set(x, "conditionalAccessPolicies", js.Array(value*))
    
    inline def setCrossTenantAccessPolicy(value: NullableOption[CrossTenantAccessPolicy]): Self = StObject.set(x, "crossTenantAccessPolicy", value.asInstanceOf[js.Any])
    
    inline def setCrossTenantAccessPolicyNull: Self = StObject.set(x, "crossTenantAccessPolicy", null)
    
    inline def setCrossTenantAccessPolicyUndefined: Self = StObject.set(x, "crossTenantAccessPolicy", js.undefined)
    
    inline def setFeatureRolloutPolicies(value: NullableOption[js.Array[FeatureRolloutPolicy]]): Self = StObject.set(x, "featureRolloutPolicies", value.asInstanceOf[js.Any])
    
    inline def setFeatureRolloutPoliciesNull: Self = StObject.set(x, "featureRolloutPolicies", null)
    
    inline def setFeatureRolloutPoliciesUndefined: Self = StObject.set(x, "featureRolloutPolicies", js.undefined)
    
    inline def setFeatureRolloutPoliciesVarargs(value: FeatureRolloutPolicy*): Self = StObject.set(x, "featureRolloutPolicies", js.Array(value*))
    
    inline def setHomeRealmDiscoveryPolicies(value: NullableOption[js.Array[HomeRealmDiscoveryPolicy]]): Self = StObject.set(x, "homeRealmDiscoveryPolicies", value.asInstanceOf[js.Any])
    
    inline def setHomeRealmDiscoveryPoliciesNull: Self = StObject.set(x, "homeRealmDiscoveryPolicies", null)
    
    inline def setHomeRealmDiscoveryPoliciesUndefined: Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.undefined)
    
    inline def setHomeRealmDiscoveryPoliciesVarargs(value: HomeRealmDiscoveryPolicy*): Self = StObject.set(x, "homeRealmDiscoveryPolicies", js.Array(value*))
    
    inline def setIdentitySecurityDefaultsEnforcementPolicy(value: NullableOption[IdentitySecurityDefaultsEnforcementPolicy]): Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", value.asInstanceOf[js.Any])
    
    inline def setIdentitySecurityDefaultsEnforcementPolicyNull: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", null)
    
    inline def setIdentitySecurityDefaultsEnforcementPolicyUndefined: Self = StObject.set(x, "identitySecurityDefaultsEnforcementPolicy", js.undefined)
    
    inline def setPermissionGrantPolicies(value: NullableOption[js.Array[PermissionGrantPolicy]]): Self = StObject.set(x, "permissionGrantPolicies", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantPoliciesNull: Self = StObject.set(x, "permissionGrantPolicies", null)
    
    inline def setPermissionGrantPoliciesUndefined: Self = StObject.set(x, "permissionGrantPolicies", js.undefined)
    
    inline def setPermissionGrantPoliciesVarargs(value: PermissionGrantPolicy*): Self = StObject.set(x, "permissionGrantPolicies", js.Array(value*))
    
    inline def setRoleManagementPolicies(value: NullableOption[js.Array[UnifiedRoleManagementPolicy]]): Self = StObject.set(x, "roleManagementPolicies", value.asInstanceOf[js.Any])
    
    inline def setRoleManagementPoliciesNull: Self = StObject.set(x, "roleManagementPolicies", null)
    
    inline def setRoleManagementPoliciesUndefined: Self = StObject.set(x, "roleManagementPolicies", js.undefined)
    
    inline def setRoleManagementPoliciesVarargs(value: UnifiedRoleManagementPolicy*): Self = StObject.set(x, "roleManagementPolicies", js.Array(value*))
    
    inline def setRoleManagementPolicyAssignments(value: NullableOption[js.Array[UnifiedRoleManagementPolicyAssignment]]): Self = StObject.set(x, "roleManagementPolicyAssignments", value.asInstanceOf[js.Any])
    
    inline def setRoleManagementPolicyAssignmentsNull: Self = StObject.set(x, "roleManagementPolicyAssignments", null)
    
    inline def setRoleManagementPolicyAssignmentsUndefined: Self = StObject.set(x, "roleManagementPolicyAssignments", js.undefined)
    
    inline def setRoleManagementPolicyAssignmentsVarargs(value: UnifiedRoleManagementPolicyAssignment*): Self = StObject.set(x, "roleManagementPolicyAssignments", js.Array(value*))
    
    inline def setTokenIssuancePolicies(value: NullableOption[js.Array[TokenIssuancePolicy]]): Self = StObject.set(x, "tokenIssuancePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenIssuancePoliciesNull: Self = StObject.set(x, "tokenIssuancePolicies", null)
    
    inline def setTokenIssuancePoliciesUndefined: Self = StObject.set(x, "tokenIssuancePolicies", js.undefined)
    
    inline def setTokenIssuancePoliciesVarargs(value: TokenIssuancePolicy*): Self = StObject.set(x, "tokenIssuancePolicies", js.Array(value*))
    
    inline def setTokenLifetimePolicies(value: NullableOption[js.Array[TokenLifetimePolicy]]): Self = StObject.set(x, "tokenLifetimePolicies", value.asInstanceOf[js.Any])
    
    inline def setTokenLifetimePoliciesNull: Self = StObject.set(x, "tokenLifetimePolicies", null)
    
    inline def setTokenLifetimePoliciesUndefined: Self = StObject.set(x, "tokenLifetimePolicies", js.undefined)
    
    inline def setTokenLifetimePoliciesVarargs(value: TokenLifetimePolicy*): Self = StObject.set(x, "tokenLifetimePolicies", js.Array(value*))
  }
}
