package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GesturePoint extends StObject {
  
  var captured: Boolean
  
  var contactPos: Point
  
  var contactTime: Double
  
  var currentPos: Point
  
  var currentTime: Double
  
  var direction: Double
  
  var id: Double
  
  var insideElement: Boolean
  
  var insideElementPressed: Boolean
  
  var isPrimary: Boolean
  
  var lastPos: Point
  
  var lastTime: Double
  
  var speed: Double
  
  var `type`: String
}
object GesturePoint {
  
  inline def apply(
    captured: Boolean,
    contactPos: Point,
    contactTime: Double,
    currentPos: Point,
    currentTime: Double,
    direction: Double,
    id: Double,
    insideElement: Boolean,
    insideElementPressed: Boolean,
    isPrimary: Boolean,
    lastPos: Point,
    lastTime: Double,
    speed: Double,
    `type`: String
  ): GesturePoint = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], contactPos = contactPos.asInstanceOf[js.Any], contactTime = contactTime.asInstanceOf[js.Any], currentPos = currentPos.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insideElement = insideElement.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GesturePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GesturePoint] (val x: Self) extends AnyVal {
    
    inline def setCaptured(value: Boolean): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
    
    inline def setContactPos(value: Point): Self = StObject.set(x, "contactPos", value.asInstanceOf[js.Any])
    
    inline def setContactTime(value: Double): Self = StObject.set(x, "contactTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentPos(value: Point): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsideElement(value: Boolean): Self = StObject.set(x, "insideElement", value.asInstanceOf[js.Any])
    
    inline def setInsideElementPressed(value: Boolean): Self = StObject.set(x, "insideElementPressed", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setLastPos(value: Point): Self = StObject.set(x, "lastPos", value.asInstanceOf[js.Any])
    
    inline def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
