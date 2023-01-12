package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetMarginData extends StObject {
  
  val glyphMarginLeft: Double
  
  val glyphMarginWidth: Double
  
  val isAfterLines: Boolean
  
  val lineNumbersWidth: Double
  
  val offsetX: Double
}
object IMouseTargetMarginData {
  
  inline def apply(
    glyphMarginLeft: Double,
    glyphMarginWidth: Double,
    isAfterLines: Boolean,
    lineNumbersWidth: Double,
    offsetX: Double
  ): IMouseTargetMarginData = {
    val __obj = js.Dynamic.literal(glyphMarginLeft = glyphMarginLeft.asInstanceOf[js.Any], glyphMarginWidth = glyphMarginWidth.asInstanceOf[js.Any], isAfterLines = isAfterLines.asInstanceOf[js.Any], lineNumbersWidth = lineNumbersWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetMarginData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseTargetMarginData] (val x: Self) extends AnyVal {
    
    inline def setGlyphMarginLeft(value: Double): Self = StObject.set(x, "glyphMarginLeft", value.asInstanceOf[js.Any])
    
    inline def setGlyphMarginWidth(value: Double): Self = StObject.set(x, "glyphMarginWidth", value.asInstanceOf[js.Any])
    
    inline def setIsAfterLines(value: Boolean): Self = StObject.set(x, "isAfterLines", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersWidth(value: Double): Self = StObject.set(x, "lineNumbersWidth", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
  }
}
