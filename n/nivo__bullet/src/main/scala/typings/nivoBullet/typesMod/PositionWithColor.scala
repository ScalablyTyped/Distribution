package typings.nivoBullet.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionWithColor extends StObject {
  
  var color: String
  
  var transform: String
  
  var x: Double
  
  var y1: Double
  
  var y2: Double
}
object PositionWithColor {
  
  inline def apply(color: String, transform: String, x: Double, y1: Double, y2: Double): PositionWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionWithColor]
  }
  
  extension [Self <: PositionWithColor](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
