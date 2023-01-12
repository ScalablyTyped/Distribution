package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColumn extends StObject {
  
  // Whether to allow multiple lines of text.
  var allowMultipleLines: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Whether updates to this column should replace existing text, or append to it.
  var appendChangesToExistingText: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The size of the text box.
  var linesForEditing: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The maximum number of characters for the value.
  var maxLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The type of text being stored. Must be one of plain or richText
  var textType: js.UndefOr[NullableOption[String]] = js.undefined
}
object TextColumn {
  
  inline def apply(): TextColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextColumn] (val x: Self) extends AnyVal {
    
    inline def setAllowMultipleLines(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleLines", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleLinesNull: Self = StObject.set(x, "allowMultipleLines", null)
    
    inline def setAllowMultipleLinesUndefined: Self = StObject.set(x, "allowMultipleLines", js.undefined)
    
    inline def setAppendChangesToExistingText(value: NullableOption[Boolean]): Self = StObject.set(x, "appendChangesToExistingText", value.asInstanceOf[js.Any])
    
    inline def setAppendChangesToExistingTextNull: Self = StObject.set(x, "appendChangesToExistingText", null)
    
    inline def setAppendChangesToExistingTextUndefined: Self = StObject.set(x, "appendChangesToExistingText", js.undefined)
    
    inline def setLinesForEditing(value: NullableOption[Double]): Self = StObject.set(x, "linesForEditing", value.asInstanceOf[js.Any])
    
    inline def setLinesForEditingNull: Self = StObject.set(x, "linesForEditing", null)
    
    inline def setLinesForEditingUndefined: Self = StObject.set(x, "linesForEditing", js.undefined)
    
    inline def setMaxLength(value: NullableOption[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setTextType(value: NullableOption[String]): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    inline def setTextTypeNull: Self = StObject.set(x, "textType", null)
    
    inline def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
  }
}
