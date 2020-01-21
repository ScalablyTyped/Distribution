package typings.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationOptions extends js.Object {
  var tracking: js.UndefOr[Boolean] = js.undefined
}

object DeviceOrientationOptions {
  @scala.inline
  def apply(tracking: js.UndefOr[Boolean] = js.undefined): DeviceOrientationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationOptions]
  }
}

