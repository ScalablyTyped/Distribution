package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_VIEW_ZONE
import typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_VIEW_ZONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetViewZone
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val detail: IMouseTargetViewZoneData
  
  @JSName("position")
  val position_IMouseTargetViewZone: Position
  
  @JSName("range")
  val range_IMouseTargetViewZone: Range
  
  val `type`: GUTTER_VIEW_ZONE | CONTENT_VIEW_ZONE
}
object IMouseTargetViewZone {
  
  inline def apply(
    detail: IMouseTargetViewZoneData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_VIEW_ZONE | CONTENT_VIEW_ZONE
  ): IMouseTargetViewZone = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetViewZone]
  }
  
  extension [Self <: IMouseTargetViewZone](x: Self) {
    
    inline def setDetail(value: IMouseTargetViewZoneData): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: GUTTER_VIEW_ZONE | CONTENT_VIEW_ZONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
