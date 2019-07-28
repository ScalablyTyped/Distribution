package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Checker
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CrissCross
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Down
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray16
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray25
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray50
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray75
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Gray8
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Horizontal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightDown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightHorizontal
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightUp
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LightVertical
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinearGradient
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RectangularGradient
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SemiGray75
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Solid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Up
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Vertical
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
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object CellPropertiesFill {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
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

