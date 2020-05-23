package typings.ngGrid.ngGrid

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
    outerHeight: js.UndefOr[Double] = js.undefined,
    outerWidth: js.UndefOr[Double] = js.undefined
  ): IDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitHeight)) __obj.updateDynamic("autoFitHeight")(autoFitHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerHeight)) __obj.updateDynamic("outerHeight")(outerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerWidth)) __obj.updateDynamic("outerWidth")(outerWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimension]
  }
}

