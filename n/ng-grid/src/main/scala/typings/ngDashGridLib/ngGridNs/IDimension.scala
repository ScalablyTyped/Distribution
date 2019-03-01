package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimension extends js.Object {
  var autoFitHeight: js.UndefOr[scala.Boolean] = js.undefined
  var outerHeight: js.UndefOr[scala.Double] = js.undefined
  var outerWidth: js.UndefOr[scala.Double] = js.undefined
}

object IDimension {
  @scala.inline
  def apply(
    autoFitHeight: js.UndefOr[scala.Boolean] = js.undefined,
    outerHeight: scala.Int | scala.Double = null,
    outerWidth: scala.Int | scala.Double = null
  ): IDimension = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFitHeight)) __obj.updateDynamic("autoFitHeight")(autoFitHeight)
    if (outerHeight != null) __obj.updateDynamic("outerHeight")(outerHeight.asInstanceOf[js.Any])
    if (outerWidth != null) __obj.updateDynamic("outerWidth")(outerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimension]
  }
}

