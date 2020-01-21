package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Checker
import typings.officeJsPreview.officeJsPreviewStrings.CrissCross
import typings.officeJsPreview.officeJsPreviewStrings.Down
import typings.officeJsPreview.officeJsPreviewStrings.Gray16
import typings.officeJsPreview.officeJsPreviewStrings.Gray25
import typings.officeJsPreview.officeJsPreviewStrings.Gray50
import typings.officeJsPreview.officeJsPreviewStrings.Gray75
import typings.officeJsPreview.officeJsPreviewStrings.Gray8
import typings.officeJsPreview.officeJsPreviewStrings.Grid
import typings.officeJsPreview.officeJsPreviewStrings.Horizontal
import typings.officeJsPreview.officeJsPreviewStrings.LightDown
import typings.officeJsPreview.officeJsPreviewStrings.LightHorizontal
import typings.officeJsPreview.officeJsPreviewStrings.LightUp
import typings.officeJsPreview.officeJsPreviewStrings.LightVertical
import typings.officeJsPreview.officeJsPreviewStrings.LinearGradient
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.RectangularGradient
import typings.officeJsPreview.officeJsPreviewStrings.SemiGray75
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import typings.officeJsPreview.officeJsPreviewStrings.Up
import typings.officeJsPreview.officeJsPreviewStrings.Vertical
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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFill]
  }
}

