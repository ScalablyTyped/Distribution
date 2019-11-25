package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimension extends js.Object {
  var autoFitHeight: js.UndefOr[Boolean] = js.undefined
  var outerHeight: js.UndefOr[Double] = js.undefined
  var outerWidth: js.UndefOr[Double] = js.undefined
}

object IDimension {
  @scala.inline
  def apply(
    autoFitHeight: js.UndefOr[Boolean] = js.undefined,
    outerHeight: Int | Double = null,
    outerWidth: Int | Double = null
  ): IDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitHeight)) __obj.updateDynamic("autoFitHeight")(autoFitHeight.asInstanceOf[js.Any])
    if (outerHeight != null) __obj.updateDynamic("outerHeight")(outerHeight.asInstanceOf[js.Any])
    if (outerWidth != null) __obj.updateDynamic("outerWidth")(outerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimension]
  }
}

