package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartFont extends Entity {
  // Represents the bold status of font.
  var bold: js.UndefOr[Boolean] = js.native
  // HTML color code representation of the text color. E.g. #FF0000 represents Red.
  var color: js.UndefOr[String] = js.native
  // Represents the italic status of the font.
  var italic: js.UndefOr[Boolean] = js.native
  // Font name (e.g. 'Calibri')
  var name: js.UndefOr[String] = js.native
  // Size of the font (e.g. 11)
  var size: js.UndefOr[Double] = js.native
  // Type of underline applied to the font. The possible values are: None, Single.
  var underline: js.UndefOr[String] = js.native
}

object WorkbookChartFont {
  @scala.inline
  def apply(): WorkbookChartFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartFont]
  }
  @scala.inline
  implicit class WorkbookChartFontOps[Self <: WorkbookChartFont] (val x: Self) extends AnyVal {
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
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

