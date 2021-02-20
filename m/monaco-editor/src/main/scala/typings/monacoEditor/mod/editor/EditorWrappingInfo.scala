package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorWrappingInfo extends StObject {
  
  val isDominatedByLongLines: Boolean = js.native
  
  val isViewportWrapping: Boolean = js.native
  
  val isWordWrapMinified: Boolean = js.native
  
  val wrappingColumn: Double = js.native
}
object EditorWrappingInfo {
  
  @scala.inline
  def apply(
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wrappingColumn: Double
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWrappingInfo]
  }
  
  @scala.inline
  implicit class EditorWrappingInfoMutableBuilder[Self <: EditorWrappingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDominatedByLongLines(value: Boolean): Self = StObject.set(x, "isDominatedByLongLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsViewportWrapping(value: Boolean): Self = StObject.set(x, "isViewportWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWordWrapMinified(value: Boolean): Self = StObject.set(x, "isWordWrapMinified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrappingColumn(value: Double): Self = StObject.set(x, "wrappingColumn", value.asInstanceOf[js.Any])
  }
}
