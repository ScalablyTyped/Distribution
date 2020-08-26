package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.DoubleAccountant
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.SingleAccountant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.font` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.font` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFont extends js.Object {
  /**
    *
    * Represents the `format.font.bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.font.italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.font.size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `format.font.strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `format.font.underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
  ] = js.native
}

object CellPropertiesFont {
  @scala.inline
  def apply(): CellPropertiesFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFont]
  }
  @scala.inline
  implicit class CellPropertiesFontOps[Self <: CellPropertiesFont] (val x: Self) extends AnyVal {
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    @scala.inline
    def setSubscript(value: Boolean): Self = this.set("subscript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
    @scala.inline
    def setSuperscript(value: Boolean): Self = this.set("superscript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    @scala.inline
    def setUnderline(
      value: RangeUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
    ): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

