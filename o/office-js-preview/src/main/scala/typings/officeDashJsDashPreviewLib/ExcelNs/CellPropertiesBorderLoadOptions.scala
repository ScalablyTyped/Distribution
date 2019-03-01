package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which properties to load on the format.borders object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesBorderLoadOptions extends js.Object {
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[scala.Boolean] = js.undefined
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  var weight: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesBorderLoadOptions {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: js.UndefOr[scala.Boolean] = js.undefined,
    weight: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade)
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[CellPropertiesBorderLoadOptions]
  }
}

