package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.OVERLAY_WIDGET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetOverlayWidget
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: String
  
  @JSName("position")
  val position_IMouseTargetOverlayWidget: Null
  
  @JSName("range")
  val range_IMouseTargetOverlayWidget: Null
  
  val `type`: OVERLAY_WIDGET
}
object IMouseTargetOverlayWidget {
  
  inline def apply(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: OVERLAY_WIDGET): IMouseTargetOverlayWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetOverlayWidget]
  }
  
  extension [Self <: IMouseTargetOverlayWidget](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Null): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Null): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: OVERLAY_WIDGET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
