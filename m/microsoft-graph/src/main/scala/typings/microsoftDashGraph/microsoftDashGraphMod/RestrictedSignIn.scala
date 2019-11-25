package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictedSignIn extends SignIn {
  var targetTenantId: js.UndefOr[String] = js.undefined
}

object RestrictedSignIn {
  @scala.inline
  def apply(
    appDisplayName: String = null,
    appId: String = null,
    appliedConditionalAccessPolicies: js.Array[AppliedConditionalAccessPolicy] = null,
    clientAppUsed: String = null,
    conditionalAccessStatus: ConditionalAccessStatus = null,
    correlationId: String = null,
    createdDateTime: String = null,
    deviceDetail: DeviceDetail = null,
    id: String = null,
    ipAddress: String = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    location: SignInLocation = null,
    resourceDisplayName: String = null,
    resourceId: String = null,
    riskDetail: RiskDetail = null,
    riskEventTypes: js.Array[RiskEventType] = null,
    riskLevelAggregated: RiskLevel = null,
    riskLevelDuringSignIn: RiskLevel = null,
    riskState: RiskState = null,
    status: SignInStatus = null,
    targetTenantId: String = null,
    userDisplayName: String = null,
    userId: String = null,
    userPrincipalName: String = null
  ): RestrictedSignIn = {
    val __obj = js.Dynamic.literal()
    if (appDisplayName != null) __obj.updateDynamic("appDisplayName")(appDisplayName.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (appliedConditionalAccessPolicies != null) __obj.updateDynamic("appliedConditionalAccessPolicies")(appliedConditionalAccessPolicies.asInstanceOf[js.Any])
    if (clientAppUsed != null) __obj.updateDynamic("clientAppUsed")(clientAppUsed.asInstanceOf[js.Any])
    if (conditionalAccessStatus != null) __obj.updateDynamic("conditionalAccessStatus")(conditionalAccessStatus.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (deviceDetail != null) __obj.updateDynamic("deviceDetail")(deviceDetail.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (resourceDisplayName != null) __obj.updateDynamic("resourceDisplayName")(resourceDisplayName.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (riskDetail != null) __obj.updateDynamic("riskDetail")(riskDetail.asInstanceOf[js.Any])
    if (riskEventTypes != null) __obj.updateDynamic("riskEventTypes")(riskEventTypes.asInstanceOf[js.Any])
    if (riskLevelAggregated != null) __obj.updateDynamic("riskLevelAggregated")(riskLevelAggregated.asInstanceOf[js.Any])
    if (riskLevelDuringSignIn != null) __obj.updateDynamic("riskLevelDuringSignIn")(riskLevelDuringSignIn.asInstanceOf[js.Any])
    if (riskState != null) __obj.updateDynamic("riskState")(riskState.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetTenantId != null) __obj.updateDynamic("targetTenantId")(targetTenantId.asInstanceOf[js.Any])
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictedSignIn]
  }
}

