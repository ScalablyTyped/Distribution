package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_EMPTY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetContentEmpty
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: IMouseTargetContentEmptyData
  
  @JSName("position")
  val position_IMouseTargetContentEmpty: Position
  
  @JSName("range")
  val range_IMouseTargetContentEmpty: Range
  
  val `type`: CONTENT_EMPTY
}
object IMouseTargetContentEmpty {
  
  inline def apply(
    detail: IMouseTargetContentEmptyData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_EMPTY
  ): IMouseTargetContentEmpty = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetContentEmpty]
  }
  
  extension [Self <: IMouseTargetContentEmpty](x: Self) {
    
    inline def setDetail(value: IMouseTargetContentEmptyData): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: CONTENT_EMPTY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
