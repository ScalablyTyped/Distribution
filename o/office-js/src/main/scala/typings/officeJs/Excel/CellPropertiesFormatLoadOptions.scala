package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which properties to load on the format object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFormatLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `autoIndent` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `borders` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var borders: js.UndefOr[CellPropertiesBorderLoadOptions] = js.native
  /**
    *
    * Specifies whether to load on the `fill` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[CellPropertiesFillLoadOptions] = js.native
  /**
    *
    * Specifies whether to load on the `font` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[CellPropertiesFontLoadOptions] = js.native
  /**
    *
    * Specifies whether to load on the `horizontalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `indentLevel` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `protection` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var protection: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `readingOrder` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `shrinkToFit` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `textOrientation` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `useStandardHeight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `useStandardWidth` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `verticalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `wrapText` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object CellPropertiesFormatLoadOptions {
  @scala.inline
  def apply(): CellPropertiesFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFormatLoadOptions]
  }
  @scala.inline
  implicit class CellPropertiesFormatLoadOptionsOps[Self <: CellPropertiesFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def setAutoIndent(value: Boolean): Self = this.set("autoIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIndent: Self = this.set("autoIndent", js.undefined)
    @scala.inline
    def setBorders(value: CellPropertiesBorderLoadOptions): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setFill(value: CellPropertiesFillLoadOptions): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: CellPropertiesFontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setIndentLevel(value: Boolean): Self = this.set("indentLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentLevel: Self = this.set("indentLevel", js.undefined)
    @scala.inline
    def setProtection(value: Boolean): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    @scala.inline
    def setReadingOrder(value: Boolean): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadingOrder: Self = this.set("readingOrder", js.undefined)
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkToFit: Self = this.set("shrinkToFit", js.undefined)
    @scala.inline
    def setTextOrientation(value: Boolean): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setUseStandardHeight(value: Boolean): Self = this.set("useStandardHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStandardHeight: Self = this.set("useStandardHeight", js.undefined)
    @scala.inline
    def setUseStandardWidth(value: Boolean): Self = this.set("useStandardWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStandardWidth: Self = this.set("useStandardWidth", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapText: Self = this.set("wrapText", js.undefined)
  }
  
}

