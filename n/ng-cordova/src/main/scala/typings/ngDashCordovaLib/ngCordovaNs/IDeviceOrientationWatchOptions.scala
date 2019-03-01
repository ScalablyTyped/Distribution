package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationWatchOptions extends js.Object {
  var filter: js.UndefOr[scala.Double] = js.undefined
  var frequency: js.UndefOr[scala.Double] = js.undefined
}

object IDeviceOrientationWatchOptions {
  @scala.inline
  def apply(filter: scala.Int | scala.Double = null, frequency: scala.Int | scala.Double = null): IDeviceOrientationWatchOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationWatchOptions]
  }
}

