package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceExchangeAccessStateSummary extends js.Object {
  // Total count of devices with Exchange Access State: Allowed.
  var allowedDeviceCount: js.UndefOr[Double] = js.undefined
  // Total count of devices with Exchange Access State: Blocked.
  var blockedDeviceCount: js.UndefOr[Double] = js.undefined
  // Total count of devices with Exchange Access State: Quarantined.
  var quarantinedDeviceCount: js.UndefOr[Double] = js.undefined
  // Total count of devices for which no Exchange Access State could be found.
  var unavailableDeviceCount: js.UndefOr[Double] = js.undefined
  // Total count of devices with Exchange Access State: Unknown.
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
}

object DeviceExchangeAccessStateSummary {
  @scala.inline
  def apply(
    allowedDeviceCount: js.UndefOr[Double] = js.undefined,
    blockedDeviceCount: js.UndefOr[Double] = js.undefined,
    quarantinedDeviceCount: js.UndefOr[Double] = js.undefined,
    unavailableDeviceCount: js.UndefOr[Double] = js.undefined,
    unknownDeviceCount: js.UndefOr[Double] = js.undefined
  ): DeviceExchangeAccessStateSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedDeviceCount)) __obj.updateDynamic("allowedDeviceCount")(allowedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockedDeviceCount)) __obj.updateDynamic("blockedDeviceCount")(blockedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quarantinedDeviceCount)) __obj.updateDynamic("quarantinedDeviceCount")(quarantinedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unavailableDeviceCount)) __obj.updateDynamic("unavailableDeviceCount")(unavailableDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownDeviceCount)) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceExchangeAccessStateSummary]
  }
}

