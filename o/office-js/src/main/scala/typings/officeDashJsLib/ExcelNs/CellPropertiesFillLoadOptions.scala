package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.fill` object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFillLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesFillLoadOptions {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: js.UndefOr[scala.Boolean] = js.undefined,
    patternColor: js.UndefOr[scala.Boolean] = js.undefined,
    patternTintAndShade: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(pattern)) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(patternColor)) __obj.updateDynamic("patternColor")(patternColor)
    if (!js.isUndefined(patternTintAndShade)) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade)
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade)
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
}

