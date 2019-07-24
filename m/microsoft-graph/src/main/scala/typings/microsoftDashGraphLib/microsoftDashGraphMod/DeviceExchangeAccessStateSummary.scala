package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceExchangeAccessStateSummary extends js.Object {
  // Total count of devices with Exchange Access State: Allowed.
  var allowedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Total count of devices with Exchange Access State: Blocked.
  var blockedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Total count of devices with Exchange Access State: Quarantined.
  var quarantinedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Total count of devices for which no Exchange Access State could be found.
  var unavailableDeviceCount: js.UndefOr[scala.Double] = js.undefined
  // Total count of devices with Exchange Access State: Unknown.
  var unknownDeviceCount: js.UndefOr[scala.Double] = js.undefined
}

object DeviceExchangeAccessStateSummary {
  @scala.inline
  def apply(
    allowedDeviceCount: scala.Int | scala.Double = null,
    blockedDeviceCount: scala.Int | scala.Double = null,
    quarantinedDeviceCount: scala.Int | scala.Double = null,
    unavailableDeviceCount: scala.Int | scala.Double = null,
    unknownDeviceCount: scala.Int | scala.Double = null
  ): DeviceExchangeAccessStateSummary = {
    val __obj = js.Dynamic.literal()
    if (allowedDeviceCount != null) __obj.updateDynamic("allowedDeviceCount")(allowedDeviceCount.asInstanceOf[js.Any])
    if (blockedDeviceCount != null) __obj.updateDynamic("blockedDeviceCount")(blockedDeviceCount.asInstanceOf[js.Any])
    if (quarantinedDeviceCount != null) __obj.updateDynamic("quarantinedDeviceCount")(quarantinedDeviceCount.asInstanceOf[js.Any])
    if (unavailableDeviceCount != null) __obj.updateDynamic("unavailableDeviceCount")(unavailableDeviceCount.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceExchangeAccessStateSummary]
  }
}

