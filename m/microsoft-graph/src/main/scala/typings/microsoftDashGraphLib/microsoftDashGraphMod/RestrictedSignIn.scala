package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictedSignIn extends SignIn {
  var targetTenantId: js.UndefOr[java.lang.String] = js.undefined
}

object RestrictedSignIn {
  @scala.inline
  def apply(
    appDisplayName: java.lang.String = null,
    appId: java.lang.String = null,
    appliedConditionalAccessPolicies: js.Array[AppliedConditionalAccessPolicy] = null,
    clientAppUsed: java.lang.String = null,
    conditionalAccessStatus: ConditionalAccessStatus = null,
    correlationId: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    deviceDetail: DeviceDetail = null,
    id: java.lang.String = null,
    ipAddress: java.lang.String = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    location: SignInLocation = null,
    resourceDisplayName: java.lang.String = null,
    resourceId: java.lang.String = null,
    riskDetail: RiskDetail = null,
    riskEventTypes: js.Array[RiskEventType] = null,
    riskLevelAggregated: RiskLevel = null,
    riskLevelDuringSignIn: RiskLevel = null,
    riskState: RiskState = null,
    status: SignInStatus = null,
    targetTenantId: java.lang.String = null,
    userDisplayName: java.lang.String = null,
    userId: java.lang.String = null,
    userPrincipalName: java.lang.String = null
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

