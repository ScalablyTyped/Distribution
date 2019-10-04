package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.FillPattern
import typings.officeDashJs.officeDashJsStrings.Checker
import typings.officeDashJs.officeDashJsStrings.CrissCross
import typings.officeDashJs.officeDashJsStrings.Down
import typings.officeDashJs.officeDashJsStrings.Gray16
import typings.officeDashJs.officeDashJsStrings.Gray25
import typings.officeDashJs.officeDashJsStrings.Gray50
import typings.officeDashJs.officeDashJsStrings.Gray75
import typings.officeDashJs.officeDashJsStrings.Gray8
import typings.officeDashJs.officeDashJsStrings.Grid
import typings.officeDashJs.officeDashJsStrings.Horizontal
import typings.officeDashJs.officeDashJsStrings.LightDown
import typings.officeDashJs.officeDashJsStrings.LightHorizontal
import typings.officeDashJs.officeDashJsStrings.LightUp
import typings.officeDashJs.officeDashJsStrings.LightVertical
import typings.officeDashJs.officeDashJsStrings.LinearGradient
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.RectangularGradient
import typings.officeDashJs.officeDashJsStrings.SemiGray75
import typings.officeDashJs.officeDashJsStrings.Solid
import typings.officeDashJs.officeDashJsStrings.Up
import typings.officeDashJs.officeDashJsStrings.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeFill.toJSON()`. */
trait RangeFillData extends js.Object {
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object RangeFillData {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
  ): RangeFillData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor)
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFillData]
  }
}

