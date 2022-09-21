package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetViewZoneData extends StObject {
  
  val afterLineNumber: Double
  
  val position: Position
  
  val positionAfter: Position | Null
  
  val positionBefore: Position | Null
  
  val viewZoneId: String
}
object IMouseTargetViewZoneData {
  
  inline def apply(afterLineNumber: Double, position: Position, viewZoneId: String): IMouseTargetViewZoneData = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], viewZoneId = viewZoneId.asInstanceOf[js.Any], positionAfter = null, positionBefore = null)
    __obj.asInstanceOf[IMouseTargetViewZoneData]
  }
  
  extension [Self <: IMouseTargetViewZoneData](x: Self) {
    
    inline def setAfterLineNumber(value: Double): Self = StObject.set(x, "afterLineNumber", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionAfter(value: Position): Self = StObject.set(x, "positionAfter", value.asInstanceOf[js.Any])
    
    inline def setPositionAfterNull: Self = StObject.set(x, "positionAfter", null)
    
    inline def setPositionBefore(value: Position): Self = StObject.set(x, "positionBefore", value.asInstanceOf[js.Any])
    
    inline def setPositionBeforeNull: Self = StObject.set(x, "positionBefore", null)
    
    inline def setViewZoneId(value: String): Self = StObject.set(x, "viewZoneId", value.asInstanceOf[js.Any])
  }
}
