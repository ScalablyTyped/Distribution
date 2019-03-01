package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

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
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pattern: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.FillPattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Down | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Up | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Checker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SemiGray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightUp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CrissCross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray16 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinearGradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RectangularGradient
  ] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternTintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
}

object RangeFillData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    pattern: officeDashJsDashPreviewLib.ExcelNs.FillPattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Down | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Up | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Checker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SemiGray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightUp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CrissCross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray16 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinearGradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RectangularGradient = null,
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

