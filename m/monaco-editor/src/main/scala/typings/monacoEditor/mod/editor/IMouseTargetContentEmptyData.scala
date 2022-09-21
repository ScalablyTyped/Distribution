package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetContentEmptyData extends StObject {
  
  val horizontalDistanceToText: js.UndefOr[Double] = js.undefined
  
  val isAfterLines: Boolean
}
object IMouseTargetContentEmptyData {
  
  inline def apply(isAfterLines: Boolean): IMouseTargetContentEmptyData = {
    val __obj = js.Dynamic.literal(isAfterLines = isAfterLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetContentEmptyData]
  }
  
  extension [Self <: IMouseTargetContentEmptyData](x: Self) {
    
    inline def setHorizontalDistanceToText(value: Double): Self = StObject.set(x, "horizontalDistanceToText", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDistanceToTextUndefined: Self = StObject.set(x, "horizontalDistanceToText", js.undefined)
    
    inline def setIsAfterLines(value: Boolean): Self = StObject.set(x, "isAfterLines", value.asInstanceOf[js.Any])
  }
}
