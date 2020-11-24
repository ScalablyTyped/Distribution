package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColumn extends js.Object {
  
  // Whether to allow multiple lines of text.
  var allowMultipleLines: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Whether updates to this column should replace existing text, or append to it.
  var appendChangesToExistingText: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The size of the text box.
  var linesForEditing: js.UndefOr[NullableOption[Double]] = js.native
  
  // The maximum number of characters for the value.
  var maxLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // The type of text being stored. Must be one of plain or richText
  var textType: js.UndefOr[NullableOption[String]] = js.native
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
    def setAllowMultipleLines(value: NullableOption[Boolean]): Self = this.set("allowMultipleLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleLines: Self = this.set("allowMultipleLines", js.undefined)
    
    @scala.inline
    def setAllowMultipleLinesNull: Self = this.set("allowMultipleLines", null)
    
    @scala.inline
    def setAppendChangesToExistingText(value: NullableOption[Boolean]): Self = this.set("appendChangesToExistingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendChangesToExistingText: Self = this.set("appendChangesToExistingText", js.undefined)
    
    @scala.inline
    def setAppendChangesToExistingTextNull: Self = this.set("appendChangesToExistingText", null)
    
    @scala.inline
    def setLinesForEditing(value: NullableOption[Double]): Self = this.set("linesForEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesForEditing: Self = this.set("linesForEditing", js.undefined)
    
    @scala.inline
    def setLinesForEditingNull: Self = this.set("linesForEditing", null)
    
    @scala.inline
    def setMaxLength(value: NullableOption[Double]): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxLengthNull: Self = this.set("maxLength", null)
    
    @scala.inline
    def setTextType(value: NullableOption[String]): Self = this.set("textType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextType: Self = this.set("textType", js.undefined)
    
    @scala.inline
    def setTextTypeNull: Self = this.set("textType", null)
  }
}
