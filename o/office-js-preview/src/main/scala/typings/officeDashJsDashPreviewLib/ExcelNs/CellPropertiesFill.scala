package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellPropertiesFill extends js.Object {
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pattern: js.UndefOr[
    FillPattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Down | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Up | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Checker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SemiGray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightUp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CrissCross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray16 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinearGradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RectangularGradient
  ] = js.undefined
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var patternTintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
}

object CellPropertiesFill {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    pattern: FillPattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Down | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Up | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Checker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SemiGray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightUp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CrissCross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray16 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinearGradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RectangularGradient = null,
    patternColor: java.lang.String = null,
    patternTintAndShade: scala.Int | scala.Double = null,
    tintAndShade: scala.Int | scala.Double = null
  ): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor)
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFill]
  }
}

