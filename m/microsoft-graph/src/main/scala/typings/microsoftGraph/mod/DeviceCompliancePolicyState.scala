package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicyState extends Entity {
  // The name of the policy for this policyBase
  var displayName: js.UndefOr[String] = js.undefined
  // Platform type that the policy applies to
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  // Count of how many setting a policy holds
  var settingCount: js.UndefOr[Double] = js.undefined
  var settingStates: js.UndefOr[js.Array[DeviceCompliancePolicySettingState]] = js.undefined
  // The compliance state of the policy
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  // The version of the policy
  var version: js.UndefOr[Double] = js.undefined
}

object DeviceCompliancePolicyState {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    platformType: PolicyPlatformType = null,
    settingCount: js.UndefOr[Double] = js.undefined,
    settingStates: js.Array[DeviceCompliancePolicySettingState] = null,
    state: ComplianceStatus = null,
    version: js.UndefOr[Double] = js.undefined
  ): DeviceCompliancePolicyState = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (platformType != null) __obj.updateDynamic("platformType")(platformType.asInstanceOf[js.Any])
    if (!js.isUndefined(settingCount)) __obj.updateDynamic("settingCount")(settingCount.get.asInstanceOf[js.Any])
    if (settingStates != null) __obj.updateDynamic("settingStates")(settingStates.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicyState]
  }
}

