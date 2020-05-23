package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.FillPattern
import typings.officeJs.officeJsStrings.Checker
import typings.officeJs.officeJsStrings.CrissCross
import typings.officeJs.officeJsStrings.Down
import typings.officeJs.officeJsStrings.Gray16
import typings.officeJs.officeJsStrings.Gray25
import typings.officeJs.officeJsStrings.Gray50
import typings.officeJs.officeJsStrings.Gray75
import typings.officeJs.officeJsStrings.Gray8
import typings.officeJs.officeJsStrings.Grid
import typings.officeJs.officeJsStrings.Horizontal
import typings.officeJs.officeJsStrings.LightDown
import typings.officeJs.officeJsStrings.LightHorizontal
import typings.officeJs.officeJsStrings.LightUp
import typings.officeJs.officeJsStrings.LightVertical
import typings.officeJs.officeJsStrings.LinearGradient
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.RectangularGradient
import typings.officeJs.officeJsStrings.SemiGray75
import typings.officeJs.officeJsStrings.Solid
import typings.officeJs.officeJsStrings.Up
import typings.officeJs.officeJsStrings.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeFill object, for use in `rangeFill.set({ ... })`. */
trait RangeFillUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * The pattern of a range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * The HTML color code representing the color of the range pattern, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object RangeFillUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: js.UndefOr[Double] = js.undefined,
    tintAndShade: js.UndefOr[Double] = js.undefined
  ): RangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (!js.isUndefined(patternTintAndShade)) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFillUpdateData]
  }
}

