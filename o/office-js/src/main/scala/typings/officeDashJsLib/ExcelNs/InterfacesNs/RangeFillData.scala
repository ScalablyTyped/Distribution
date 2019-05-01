package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rangeFill.toJSON()". */
trait RangeFillData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    officeDashJsLib.ExcelNs.FillPattern | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.Gray50 | officeDashJsLib.officeDashJsLibStrings.Gray75 | officeDashJsLib.officeDashJsLibStrings.Gray25 | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Down | officeDashJsLib.officeDashJsLibStrings.Up | officeDashJsLib.officeDashJsLibStrings.Checker | officeDashJsLib.officeDashJsLibStrings.SemiGray75 | officeDashJsLib.officeDashJsLibStrings.LightHorizontal | officeDashJsLib.officeDashJsLibStrings.LightVertical | officeDashJsLib.officeDashJsLibStrings.LightDown | officeDashJsLib.officeDashJsLibStrings.LightUp | officeDashJsLib.officeDashJsLibStrings.Grid | officeDashJsLib.officeDashJsLibStrings.CrissCross | officeDashJsLib.officeDashJsLibStrings.Gray16 | officeDashJsLib.officeDashJsLibStrings.Gray8 | officeDashJsLib.officeDashJsLibStrings.LinearGradient | officeDashJsLib.officeDashJsLibStrings.RectangularGradient
  ] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
}

object RangeFillData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    pattern: officeDashJsLib.ExcelNs.FillPattern | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.Gray50 | officeDashJsLib.officeDashJsLibStrings.Gray75 | officeDashJsLib.officeDashJsLibStrings.Gray25 | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Down | officeDashJsLib.officeDashJsLibStrings.Up | officeDashJsLib.officeDashJsLibStrings.Checker | officeDashJsLib.officeDashJsLibStrings.SemiGray75 | officeDashJsLib.officeDashJsLibStrings.LightHorizontal | officeDashJsLib.officeDashJsLibStrings.LightVertical | officeDashJsLib.officeDashJsLibStrings.LightDown | officeDashJsLib.officeDashJsLibStrings.LightUp | officeDashJsLib.officeDashJsLibStrings.Grid | officeDashJsLib.officeDashJsLibStrings.CrissCross | officeDashJsLib.officeDashJsLibStrings.Gray16 | officeDashJsLib.officeDashJsLibStrings.Gray8 | officeDashJsLib.officeDashJsLibStrings.LinearGradient | officeDashJsLib.officeDashJsLibStrings.RectangularGradient = null,
    patternColor: java.lang.String = null,
    patternTintAndShade: scala.Int | scala.Double = null,
    tintAndShade: scala.Int | scala.Double = null
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

