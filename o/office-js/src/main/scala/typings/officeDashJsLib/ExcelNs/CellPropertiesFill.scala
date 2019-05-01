package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFill extends js.Object {
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.Gray50 | officeDashJsLib.officeDashJsLibStrings.Gray75 | officeDashJsLib.officeDashJsLibStrings.Gray25 | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Down | officeDashJsLib.officeDashJsLibStrings.Up | officeDashJsLib.officeDashJsLibStrings.Checker | officeDashJsLib.officeDashJsLibStrings.SemiGray75 | officeDashJsLib.officeDashJsLibStrings.LightHorizontal | officeDashJsLib.officeDashJsLibStrings.LightVertical | officeDashJsLib.officeDashJsLibStrings.LightDown | officeDashJsLib.officeDashJsLibStrings.LightUp | officeDashJsLib.officeDashJsLibStrings.Grid | officeDashJsLib.officeDashJsLibStrings.CrissCross | officeDashJsLib.officeDashJsLibStrings.Gray16 | officeDashJsLib.officeDashJsLibStrings.Gray8 | officeDashJsLib.officeDashJsLibStrings.LinearGradient | officeDashJsLib.officeDashJsLibStrings.RectangularGradient
  ] = js.undefined
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
}

object CellPropertiesFill {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    pattern: FillPattern | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.Gray50 | officeDashJsLib.officeDashJsLibStrings.Gray75 | officeDashJsLib.officeDashJsLibStrings.Gray25 | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Down | officeDashJsLib.officeDashJsLibStrings.Up | officeDashJsLib.officeDashJsLibStrings.Checker | officeDashJsLib.officeDashJsLibStrings.SemiGray75 | officeDashJsLib.officeDashJsLibStrings.LightHorizontal | officeDashJsLib.officeDashJsLibStrings.LightVertical | officeDashJsLib.officeDashJsLibStrings.LightDown | officeDashJsLib.officeDashJsLibStrings.LightUp | officeDashJsLib.officeDashJsLibStrings.Grid | officeDashJsLib.officeDashJsLibStrings.CrissCross | officeDashJsLib.officeDashJsLibStrings.Gray16 | officeDashJsLib.officeDashJsLibStrings.Gray8 | officeDashJsLib.officeDashJsLibStrings.LinearGradient | officeDashJsLib.officeDashJsLibStrings.RectangularGradient = null,
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

