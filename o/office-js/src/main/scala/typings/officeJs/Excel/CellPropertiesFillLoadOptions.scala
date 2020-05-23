package typings.officeJs.Excel

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
    * Specifies whether to load the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load the `pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load the `patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load the `patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesFillLoadOptions {
  @scala.inline
  def apply(
    color: js.UndefOr[Boolean] = js.undefined,
    pattern: js.UndefOr[Boolean] = js.undefined,
    patternColor: js.UndefOr[Boolean] = js.undefined,
    patternTintAndShade: js.UndefOr[Boolean] = js.undefined,
    tintAndShade: js.UndefOr[Boolean] = js.undefined
  ): CellPropertiesFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pattern)) __obj.updateDynamic("pattern")(pattern.get.asInstanceOf[js.Any])
    if (!js.isUndefined(patternColor)) __obj.updateDynamic("patternColor")(patternColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(patternTintAndShade)) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFillLoadOptions]
  }
}

