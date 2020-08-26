package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `textRange.toJSON()`. */
@js.native
trait TextRangeData extends js.Object {
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontData] = js.native
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.native
}

object TextRangeData {
  @scala.inline
  def apply(): TextRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeData]
  }
  @scala.inline
  implicit class TextRangeDataOps[Self <: TextRangeData] (val x: Self) extends AnyVal {
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
    def setFont(value: ShapeFontData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

