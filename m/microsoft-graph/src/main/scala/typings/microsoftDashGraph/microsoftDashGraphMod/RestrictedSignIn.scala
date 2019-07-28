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
    if (appDisplayName != null) __obj.updateDynamic("appDisplayName")(appDisplayName)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (appliedConditionalAccessPolicies != null) __obj.updateDynamic("appliedConditionalAccessPolicies")(appliedConditionalAccessPolicies)
    if (clientAppUsed != null) __obj.updateDynamic("clientAppUsed")(clientAppUsed)
    if (conditionalAccessStatus != null) __obj.updateDynamic("conditionalAccessStatus")(conditionalAccessStatus)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (deviceDetail != null) __obj.updateDynamic("deviceDetail")(deviceDetail)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (location != null) __obj.updateDynamic("location")(location)
    if (resourceDisplayName != null) __obj.updateDynamic("resourceDisplayName")(resourceDisplayName)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (riskDetail != null) __obj.updateDynamic("riskDetail")(riskDetail)
    if (riskEventTypes != null) __obj.updateDynamic("riskEventTypes")(riskEventTypes)
    if (riskLevelAggregated != null) __obj.updateDynamic("riskLevelAggregated")(riskLevelAggregated)
    if (riskLevelDuringSignIn != null) __obj.updateDynamic("riskLevelDuringSignIn")(riskLevelDuringSignIn)
    if (riskState != null) __obj.updateDynamic("riskState")(riskState)
    if (status != null) __obj.updateDynamic("status")(status)
    if (targetTenantId != null) __obj.updateDynamic("targetTenantId")(targetTenantId)
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[RestrictedSignIn]
  }
}

