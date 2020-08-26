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
@js.native
trait CellPropertiesFill extends js.Object {
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.native
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
}

object CellPropertiesFill {
  @scala.inline
  def apply(): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFill]
  }
  @scala.inline
  implicit class CellPropertiesFillOps[Self <: CellPropertiesFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternColor(value: String): Self = this.set("patternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternColor: Self = this.set("patternColor", js.undefined)
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = this.set("patternTintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternTintAndShade: Self = this.set("patternTintAndShade", js.undefined)
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
  }
  
}

