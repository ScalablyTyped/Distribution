package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextColumn extends js.Object {
  // Whether to allow multiple lines of text.
  var allowMultipleLines: js.UndefOr[Boolean] = js.native
  // Whether updates to this column should replace existing text, or append to it.
  var appendChangesToExistingText: js.UndefOr[Boolean] = js.native
  // The size of the text box.
  var linesForEditing: js.UndefOr[Double] = js.native
  // The maximum number of characters for the value.
  var maxLength: js.UndefOr[Double] = js.native
  // The type of text being stored. Must be one of plain or richText
  var textType: js.UndefOr[String] = js.native
}

object TextColumn {
  @scala.inline
  def apply(): TextColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColumn]
  }
  @scala.inline
  implicit class TextColumnOps[Self <: TextColumn] (val x: Self) extends AnyVal {
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
    def setAllowMultipleLines(value: Boolean): Self = this.set("allowMultipleLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleLines: Self = this.set("allowMultipleLines", js.undefined)
    @scala.inline
    def setAppendChangesToExistingText(value: Boolean): Self = this.set("appendChangesToExistingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendChangesToExistingText: Self = this.set("appendChangesToExistingText", js.undefined)
    @scala.inline
    def setLinesForEditing(value: Double): Self = this.set("linesForEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinesForEditing: Self = this.set("linesForEditing", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setTextType(value: String): Self = this.set("textType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextType: Self = this.set("textType", js.undefined)
  }
  
}

