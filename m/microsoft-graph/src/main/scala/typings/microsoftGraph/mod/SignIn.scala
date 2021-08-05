package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignIn
  extends StObject
     with Entity {
  
  // App name displayed in the Azure Portal.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique GUID representing the app ID in the Azure Active Directory.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var appliedConditionalAccessPolicies: js.UndefOr[NullableOption[js.Array[AppliedConditionalAccessPolicy]]] = js.undefined
  
  /**
    * Identifies the legacy client used for sign-in activity. Includes Browser, Exchange Active Sync, modern clients, IMAP,
    * MAPI, SMTP, and POP.
    */
  var clientAppUsed: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and
    * unknownFutureValue.
    */
  var conditionalAccessStatus: js.UndefOr[NullableOption[ConditionalAccessStatus]] = js.undefined
  
  // The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.
  var correlationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as '2014-01-01T00:00:00Z'.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Device information from where the sign-in occurred; includes device ID, operating system, and browser.
  var deviceDetail: js.UndefOr[NullableOption[DeviceDetail]] = js.undefined
  
  // IP address of the client used to sign in.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates if a sign-in is interactive or not.
  var isInteractive: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Provides the city, state, and country code where the sign-in originated.
  var location: js.UndefOr[NullableOption[SignInLocation]] = js.undefined
  
  // Name of the resource the user signed into.
  var resourceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the resource that the user signed into.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none,
    * adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset,
    * adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser,
    * adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user
    * or sign-in so far. Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the
    * value hidden.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  /**
    * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress,
    * maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials,
    * investigationsThreatIntelligence, generic, and unknownFutureValue.
    */
  var riskEventTypes: js.UndefOr[NullableOption[js.Array[RiskEventType]]] = js.undefined
  
  /**
    * The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress,
    * maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials,
    * investigationsThreatIntelligence, generic, or unknownFutureValue.
    */
  var riskEventTypes_v2: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelAggregated: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelDuringSignIn: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated,
    * dismissed, atRisk, confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.undefined
  
  // Sign-in status. Possible values include Success and Failure.
  var status: js.UndefOr[NullableOption[SignInStatus]] = js.undefined
  
  // Display name of the user that initiated the sign-in.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the user that initiated the sign-in.
  var userId: js.UndefOr[String] = js.undefined
  
  // User principal name of the user that initiated the sign-in.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object SignIn {
  
  inline def apply(): SignIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignIn]
  }
  
  extension [Self <: SignIn](x: Self) {
    
    inline def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    inline def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppliedConditionalAccessPolicies(value: NullableOption[js.Array[AppliedConditionalAccessPolicy]]): Self = StObject.set(x, "appliedConditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAppliedConditionalAccessPoliciesNull: Self = StObject.set(x, "appliedConditionalAccessPolicies", null)
    
    inline def setAppliedConditionalAccessPoliciesUndefined: Self = StObject.set(x, "appliedConditionalAccessPolicies", js.undefined)
    
    inline def setAppliedConditionalAccessPoliciesVarargs(value: AppliedConditionalAccessPolicy*): Self = StObject.set(x, "appliedConditionalAccessPolicies", js.Array(value :_*))
    
    inline def setClientAppUsed(value: NullableOption[String]): Self = StObject.set(x, "clientAppUsed", value.asInstanceOf[js.Any])
    
    inline def setClientAppUsedNull: Self = StObject.set(x, "clientAppUsed", null)
    
    inline def setClientAppUsedUndefined: Self = StObject.set(x, "clientAppUsed", js.undefined)
    
    inline def setConditionalAccessStatus(value: NullableOption[ConditionalAccessStatus]): Self = StObject.set(x, "conditionalAccessStatus", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessStatusNull: Self = StObject.set(x, "conditionalAccessStatus", null)
    
    inline def setConditionalAccessStatusUndefined: Self = StObject.set(x, "conditionalAccessStatus", js.undefined)
    
    inline def setCorrelationId(value: NullableOption[String]): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeviceDetail(value: NullableOption[DeviceDetail]): Self = StObject.set(x, "deviceDetail", value.asInstanceOf[js.Any])
    
    inline def setDeviceDetailNull: Self = StObject.set(x, "deviceDetail", null)
    
    inline def setDeviceDetailUndefined: Self = StObject.set(x, "deviceDetail", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIsInteractive(value: NullableOption[Boolean]): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveNull: Self = StObject.set(x, "isInteractive", null)
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLocation(value: NullableOption[SignInLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setResourceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "resourceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceDisplayNameNull: Self = StObject.set(x, "resourceDisplayName", null)
    
    inline def setResourceDisplayNameUndefined: Self = StObject.set(x, "resourceDisplayName", js.undefined)
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setRiskDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "riskDetail", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailNull: Self = StObject.set(x, "riskDetail", null)
    
    inline def setRiskDetailUndefined: Self = StObject.set(x, "riskDetail", js.undefined)
    
    inline def setRiskEventTypes(value: NullableOption[js.Array[RiskEventType]]): Self = StObject.set(x, "riskEventTypes", value.asInstanceOf[js.Any])
    
    inline def setRiskEventTypesNull: Self = StObject.set(x, "riskEventTypes", null)
    
    inline def setRiskEventTypesUndefined: Self = StObject.set(x, "riskEventTypes", js.undefined)
    
    inline def setRiskEventTypesVarargs(value: RiskEventType*): Self = StObject.set(x, "riskEventTypes", js.Array(value :_*))
    
    inline def setRiskEventTypes_v2(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "riskEventTypes_v2", value.asInstanceOf[js.Any])
    
    inline def setRiskEventTypes_v2Null: Self = StObject.set(x, "riskEventTypes_v2", null)
    
    inline def setRiskEventTypes_v2Undefined: Self = StObject.set(x, "riskEventTypes_v2", js.undefined)
    
    inline def setRiskEventTypes_v2Varargs(value: String*): Self = StObject.set(x, "riskEventTypes_v2", js.Array(value :_*))
    
    inline def setRiskLevelAggregated(value: NullableOption[RiskLevel]): Self = StObject.set(x, "riskLevelAggregated", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelAggregatedNull: Self = StObject.set(x, "riskLevelAggregated", null)
    
    inline def setRiskLevelAggregatedUndefined: Self = StObject.set(x, "riskLevelAggregated", js.undefined)
    
    inline def setRiskLevelDuringSignIn(value: NullableOption[RiskLevel]): Self = StObject.set(x, "riskLevelDuringSignIn", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelDuringSignInNull: Self = StObject.set(x, "riskLevelDuringSignIn", null)
    
    inline def setRiskLevelDuringSignInUndefined: Self = StObject.set(x, "riskLevelDuringSignIn", js.undefined)
    
    inline def setRiskState(value: NullableOption[RiskState]): Self = StObject.set(x, "riskState", value.asInstanceOf[js.Any])
    
    inline def setRiskStateNull: Self = StObject.set(x, "riskState", null)
    
    inline def setRiskStateUndefined: Self = StObject.set(x, "riskState", js.undefined)
    
    inline def setStatus(value: NullableOption[SignInStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
