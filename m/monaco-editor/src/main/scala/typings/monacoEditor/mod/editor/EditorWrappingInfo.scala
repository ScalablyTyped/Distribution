package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorWrappingInfo extends StObject {
  
  val isDominatedByLongLines: Boolean
  
  val isViewportWrapping: Boolean
  
  val isWordWrapMinified: Boolean
  
  val wrappingColumn: Double
}
object EditorWrappingInfo {
  
  inline def apply(
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wrappingColumn: Double
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWrappingInfo]
  }
  
  extension [Self <: EditorWrappingInfo](x: Self) {
    
    inline def setIsDominatedByLongLines(value: Boolean): Self = StObject.set(x, "isDominatedByLongLines", value.asInstanceOf[js.Any])
    
    inline def setIsViewportWrapping(value: Boolean): Self = StObject.set(x, "isViewportWrapping", value.asInstanceOf[js.Any])
    
    inline def setIsWordWrapMinified(value: Boolean): Self = StObject.set(x, "isWordWrapMinified", value.asInstanceOf[js.Any])
    
    inline def setWrappingColumn(value: Double): Self = StObject.set(x, "wrappingColumn", value.asInstanceOf[js.Any])
  }
}
