package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_WIDGET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetContentWidget
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: String
  
  @JSName("position")
  val position_IMouseTargetContentWidget: Null
  
  @JSName("range")
  val range_IMouseTargetContentWidget: Null
  
  val `type`: CONTENT_WIDGET
}
object IMouseTargetContentWidget {
  
  inline def apply(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: CONTENT_WIDGET): IMouseTargetContentWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetContentWidget]
  }
  
  extension [Self <: IMouseTargetContentWidget](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Null): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Null): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: CONTENT_WIDGET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
