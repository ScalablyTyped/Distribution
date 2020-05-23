package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationWatchOptions extends js.Object {
  var filter: js.UndefOr[Double] = js.undefined
  var frequency: js.UndefOr[Double] = js.undefined
}

object IDeviceOrientationWatchOptions {
  @scala.inline
  def apply(filter: js.UndefOr[Double] = js.undefined, frequency: js.UndefOr[Double] = js.undefined): IDeviceOrientationWatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationWatchOptions]
  }
}

