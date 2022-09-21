package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPathConstraintData
  extends StObject
     with IConstraintData {
  
  var offsetRotation: Double
  
  var position: Double
  
  var positionMode: PositionMode
  
  var rotateMode: RotateMode
  
  var spacing: Double
}
object IPathConstraintData {
  
  inline def apply(
    name: String,
    offsetRotation: Double,
    order: Double,
    position: Double,
    positionMode: PositionMode,
    rotateMode: RotateMode,
    spacing: Double
  ): IPathConstraintData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionMode = positionMode.asInstanceOf[js.Any], rotateMode = rotateMode.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathConstraintData]
  }
  
  extension [Self <: IPathConstraintData](x: Self) {
    
    inline def setOffsetRotation(value: Double): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionMode(value: PositionMode): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    inline def setRotateMode(value: RotateMode): Self = StObject.set(x, "rotateMode", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
