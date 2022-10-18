package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotation extends StObject {
  
  var rotation: Double
  
  var x: Double
  
  var y: Double
}
object Rotation {
  
  inline def apply(rotation: Double, x: Double, y: Double): Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  extension [Self <: Rotation](x: Self) {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
