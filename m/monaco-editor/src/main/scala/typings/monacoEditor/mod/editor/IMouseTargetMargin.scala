package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_NUMBERS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetMargin
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: IMouseTargetMarginData
  
  @JSName("position")
  val position_IMouseTargetMargin: Position
  
  @JSName("range")
  val range_IMouseTargetMargin: Range
  
  val `type`: GUTTER_GLYPH_MARGIN | GUTTER_LINE_NUMBERS | GUTTER_LINE_DECORATIONS
}
object IMouseTargetMargin {
  
  inline def apply(
    detail: IMouseTargetMarginData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_GLYPH_MARGIN | GUTTER_LINE_NUMBERS | GUTTER_LINE_DECORATIONS
  ): IMouseTargetMargin = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetMargin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseTargetMargin] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: IMouseTargetMarginData): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: GUTTER_GLYPH_MARGIN | GUTTER_LINE_NUMBERS | GUTTER_LINE_DECORATIONS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
