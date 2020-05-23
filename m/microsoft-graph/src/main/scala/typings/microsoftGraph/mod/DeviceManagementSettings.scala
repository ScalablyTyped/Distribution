package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementSettings extends js.Object {
  // The number of days a device is allowed to go without checking in to remain compliant. Valid values 0 to 120
  var deviceComplianceCheckinThresholdDays: js.UndefOr[Double] = js.undefined
  // Is feature enabled or not for scheduled action for rule.
  var isScheduledActionEnabled: js.UndefOr[Boolean] = js.undefined
  // Device should be noncompliant when there is no compliance policy targeted when this is true
  var secureByDefault: js.UndefOr[Boolean] = js.undefined
}

object DeviceManagementSettings {
  @scala.inline
  def apply(
    deviceComplianceCheckinThresholdDays: js.UndefOr[Double] = js.undefined,
    isScheduledActionEnabled: js.UndefOr[Boolean] = js.undefined,
    secureByDefault: js.UndefOr[Boolean] = js.undefined
  ): DeviceManagementSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceComplianceCheckinThresholdDays)) __obj.updateDynamic("deviceComplianceCheckinThresholdDays")(deviceComplianceCheckinThresholdDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isScheduledActionEnabled)) __obj.updateDynamic("isScheduledActionEnabled")(isScheduledActionEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureByDefault)) __obj.updateDynamic("secureByDefault")(secureByDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManagementSettings]
  }
}

