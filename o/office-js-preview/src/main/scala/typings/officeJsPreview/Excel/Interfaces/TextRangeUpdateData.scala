package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextRange object, for use in `textRange.set({ ... })`. */
@js.native
trait TextRangeUpdateData extends js.Object {
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontUpdateData] = js.native
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.native
}

object TextRangeUpdateData {
  @scala.inline
  def apply(): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeUpdateData]
  }
  @scala.inline
  implicit class TextRangeUpdateDataOps[Self <: TextRangeUpdateData] (val x: Self) extends AnyVal {
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
    def setFont(value: ShapeFontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

