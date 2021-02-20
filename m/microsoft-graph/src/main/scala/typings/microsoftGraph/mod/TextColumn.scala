package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColumn extends StObject {
  
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
  implicit class TextColumnMutableBuilder[Self <: TextColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleLines(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleLinesNull: Self = StObject.set(x, "allowMultipleLines", null)
    
    @scala.inline
    def setAllowMultipleLinesUndefined: Self = StObject.set(x, "allowMultipleLines", js.undefined)
    
    @scala.inline
    def setAppendChangesToExistingText(value: NullableOption[Boolean]): Self = StObject.set(x, "appendChangesToExistingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendChangesToExistingTextNull: Self = StObject.set(x, "appendChangesToExistingText", null)
    
    @scala.inline
    def setAppendChangesToExistingTextUndefined: Self = StObject.set(x, "appendChangesToExistingText", js.undefined)
    
    @scala.inline
    def setLinesForEditing(value: NullableOption[Double]): Self = StObject.set(x, "linesForEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesForEditingNull: Self = StObject.set(x, "linesForEditing", null)
    
    @scala.inline
    def setLinesForEditingUndefined: Self = StObject.set(x, "linesForEditing", js.undefined)
    
    @scala.inline
    def setMaxLength(value: NullableOption[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setTextType(value: NullableOption[String]): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTypeNull: Self = StObject.set(x, "textType", null)
    
    @scala.inline
    def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
  }
}
