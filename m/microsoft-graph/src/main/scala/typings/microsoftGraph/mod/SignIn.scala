package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignIn extends Entity {
  
  // App name displayed in the Azure Portal.
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique GUID representing the app ID in the Azure Active Directory.
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  var appliedConditionalAccessPolicies: js.UndefOr[NullableOption[js.Array[AppliedConditionalAccessPolicy]]] = js.native
  
  /**
    * Identifies the legacy client used for sign-in activity. Includes Browser, Exchange Active Sync, modern clients, IMAP,
    * MAPI, SMTP, and POP.
    */
  var clientAppUsed: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and
    * unknownFutureValue.
    */
  var conditionalAccessStatus: js.UndefOr[NullableOption[ConditionalAccessStatus]] = js.native
  
  // The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.
  var correlationId: js.UndefOr[NullableOption[String]] = js.native
  
  // Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as '2014-01-01T00:00:00Z'.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // Device information from where the sign-in occurred; includes device ID, operating system, and browser.
  var deviceDetail: js.UndefOr[NullableOption[DeviceDetail]] = js.native
  
  // IP address of the client used to sign in.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates if a sign-in is interactive or not.
  var isInteractive: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Provides the city, state, and country code where the sign-in originated.
  var location: js.UndefOr[NullableOption[SignInLocation]] = js.native
  
  // Name of the resource the user signed into.
  var resourceDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // ID of the resource that the user signed into.
  var resourceId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none,
    * adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset,
    * adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser,
    * adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user
    * or sign-in so far. Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the
    * value hidden.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.native
  
  /**
    * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress,
    * maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials,
    * investigationsThreatIntelligence, generic, and unknownFutureValue.
    */
  var riskEventTypes: js.UndefOr[NullableOption[js.Array[RiskEventType]]] = js.native
  
  /**
    * The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress,
    * maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials,
    * investigationsThreatIntelligence, generic, or unknownFutureValue.
    */
  var riskEventTypes_v2: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelAggregated: js.UndefOr[NullableOption[RiskLevel]] = js.native
  
  /**
    * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelDuringSignIn: js.UndefOr[NullableOption[RiskLevel]] = js.native
  
  /**
    * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated,
    * dismissed, atRisk, confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.native
  
  // Sign-in status. Possible values include Success and Failure.
  var status: js.UndefOr[NullableOption[SignInStatus]] = js.native
  
  // Display name of the user that initiated the sign-in.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // ID of the user that initiated the sign-in.
  var userId: js.UndefOr[String] = js.native
  
  // User principal name of the user that initiated the sign-in.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object SignIn {
  
  @scala.inline
  def apply(): SignIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignIn]
  }
  
  @scala.inline
  implicit class SignInOps[Self <: SignIn] (val x: Self) extends AnyVal {
    
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
    def setAppDisplayName(value: NullableOption[String]): Self = this.set("appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDisplayName: Self = this.set("appDisplayName", js.undefined)
    
    @scala.inline
    def setAppDisplayNameNull: Self = this.set("appDisplayName", null)
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setAppliedConditionalAccessPoliciesVarargs(value: AppliedConditionalAccessPolicy*): Self = this.set("appliedConditionalAccessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAppliedConditionalAccessPolicies(value: NullableOption[js.Array[AppliedConditionalAccessPolicy]]): Self = this.set("appliedConditionalAccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedConditionalAccessPolicies: Self = this.set("appliedConditionalAccessPolicies", js.undefined)
    
    @scala.inline
    def setAppliedConditionalAccessPoliciesNull: Self = this.set("appliedConditionalAccessPolicies", null)
    
    @scala.inline
    def setClientAppUsed(value: NullableOption[String]): Self = this.set("clientAppUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAppUsed: Self = this.set("clientAppUsed", js.undefined)
    
    @scala.inline
    def setClientAppUsedNull: Self = this.set("clientAppUsed", null)
    
    @scala.inline
    def setConditionalAccessStatus(value: NullableOption[ConditionalAccessStatus]): Self = this.set("conditionalAccessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalAccessStatus: Self = this.set("conditionalAccessStatus", js.undefined)
    
    @scala.inline
    def setConditionalAccessStatusNull: Self = this.set("conditionalAccessStatus", null)
    
    @scala.inline
    def setCorrelationId(value: NullableOption[String]): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setCorrelationIdNull: Self = this.set("correlationId", null)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setDeviceDetail(value: NullableOption[DeviceDetail]): Self = this.set("deviceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDetail: Self = this.set("deviceDetail", js.undefined)
    
    @scala.inline
    def setDeviceDetailNull: Self = this.set("deviceDetail", null)
    
    @scala.inline
    def setIpAddress(value: NullableOption[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setIpAddressNull: Self = this.set("ipAddress", null)
    
    @scala.inline
    def setIsInteractive(value: NullableOption[Boolean]): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    
    @scala.inline
    def setIsInteractiveNull: Self = this.set("isInteractive", null)
    
    @scala.inline
    def setLocation(value: NullableOption[SignInLocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setResourceDisplayName(value: NullableOption[String]): Self = this.set("resourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDisplayName: Self = this.set("resourceDisplayName", js.undefined)
    
    @scala.inline
    def setResourceDisplayNameNull: Self = this.set("resourceDisplayName", null)
    
    @scala.inline
    def setResourceId(value: NullableOption[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceIdNull: Self = this.set("resourceId", null)
    
    @scala.inline
    def setRiskDetail(value: NullableOption[RiskDetail]): Self = this.set("riskDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskDetail: Self = this.set("riskDetail", js.undefined)
    
    @scala.inline
    def setRiskDetailNull: Self = this.set("riskDetail", null)
    
    @scala.inline
    def setRiskEventTypesVarargs(value: RiskEventType*): Self = this.set("riskEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setRiskEventTypes(value: NullableOption[js.Array[RiskEventType]]): Self = this.set("riskEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskEventTypes: Self = this.set("riskEventTypes", js.undefined)
    
    @scala.inline
    def setRiskEventTypesNull: Self = this.set("riskEventTypes", null)
    
    @scala.inline
    def setRiskEventTypes_v2Varargs(value: String*): Self = this.set("riskEventTypes_v2", js.Array(value :_*))
    
    @scala.inline
    def setRiskEventTypes_v2(value: NullableOption[js.Array[String]]): Self = this.set("riskEventTypes_v2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskEventTypes_v2: Self = this.set("riskEventTypes_v2", js.undefined)
    
    @scala.inline
    def setRiskEventTypes_v2Null: Self = this.set("riskEventTypes_v2", null)
    
    @scala.inline
    def setRiskLevelAggregated(value: NullableOption[RiskLevel]): Self = this.set("riskLevelAggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskLevelAggregated: Self = this.set("riskLevelAggregated", js.undefined)
    
    @scala.inline
    def setRiskLevelAggregatedNull: Self = this.set("riskLevelAggregated", null)
    
    @scala.inline
    def setRiskLevelDuringSignIn(value: NullableOption[RiskLevel]): Self = this.set("riskLevelDuringSignIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskLevelDuringSignIn: Self = this.set("riskLevelDuringSignIn", js.undefined)
    
    @scala.inline
    def setRiskLevelDuringSignInNull: Self = this.set("riskLevelDuringSignIn", null)
    
    @scala.inline
    def setRiskState(value: NullableOption[RiskState]): Self = this.set("riskState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskState: Self = this.set("riskState", js.undefined)
    
    @scala.inline
    def setRiskStateNull: Self = this.set("riskState", null)
    
    @scala.inline
    def setStatus(value: NullableOption[SignInStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setUserDisplayName(value: NullableOption[String]): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    
    @scala.inline
    def setUserDisplayNameNull: Self = this.set("userDisplayName", null)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
    
    @scala.inline
    def setUserPrincipalNameNull: Self = this.set("userPrincipalName", null)
  }
}
