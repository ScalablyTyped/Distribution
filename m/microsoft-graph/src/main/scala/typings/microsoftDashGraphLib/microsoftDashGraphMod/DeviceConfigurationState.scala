package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationState extends Entity {
  /** The name of the policy for this policyBase */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Platform type that the policy applies to */
  var platformType: js.UndefOr[PolicyPlatformType] = js.undefined
  /** Count of how many setting a policy holds */
  var settingCount: js.UndefOr[scala.Double] = js.undefined
  var settingStates: js.UndefOr[js.Array[DeviceConfigurationSettingState]] = js.undefined
  /** The compliance state of the policy */
  var state: js.UndefOr[ComplianceStatus] = js.undefined
  /** The version of the policy */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DeviceConfigurationState {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    platformType: PolicyPlatformType = null,
    settingCount: scala.Int | scala.Double = null,
    settingStates: js.Array[DeviceConfigurationSettingState] = null,
    state: ComplianceStatus = null,
    version: scala.Int | scala.Double = null
  ): DeviceConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (platformType != null) __obj.updateDynamic("platformType")(platformType)
    if (settingCount != null) __obj.updateDynamic("settingCount")(settingCount.asInstanceOf[js.Any])
    if (settingStates != null) __obj.updateDynamic("settingStates")(settingStates)
    if (state != null) __obj.updateDynamic("state")(state)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationState]
  }
}

