package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementSettings extends js.Object {
  // The number of days a device is allowed to go without checking in to remain compliant. Valid values 0 to 120
  var deviceComplianceCheckinThresholdDays: js.UndefOr[scala.Double] = js.undefined
  // Is feature enabled or not for scheduled action for rule.
  var isScheduledActionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Device should be noncompliant when there is no compliance policy targeted when this is true
  var secureByDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object DeviceManagementSettings {
  @scala.inline
  def apply(
    deviceComplianceCheckinThresholdDays: scala.Int | scala.Double = null,
    isScheduledActionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    secureByDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): DeviceManagementSettings = {
    val __obj = js.Dynamic.literal()
    if (deviceComplianceCheckinThresholdDays != null) __obj.updateDynamic("deviceComplianceCheckinThresholdDays")(deviceComplianceCheckinThresholdDays.asInstanceOf[js.Any])
    if (!js.isUndefined(isScheduledActionEnabled)) __obj.updateDynamic("isScheduledActionEnabled")(isScheduledActionEnabled)
    if (!js.isUndefined(secureByDefault)) __obj.updateDynamic("secureByDefault")(secureByDefault)
    __obj.asInstanceOf[DeviceManagementSettings]
  }
}

