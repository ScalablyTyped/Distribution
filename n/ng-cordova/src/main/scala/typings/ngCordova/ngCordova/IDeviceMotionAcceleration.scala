package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceMotionAcceleration extends StObject {
  
  var timestamp: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object IDeviceMotionAcceleration {
  
  inline def apply(timestamp: Double, x: Double, y: Double, z: Double): IDeviceMotionAcceleration = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceMotionAcceleration]
  }
  
  extension [Self <: IDeviceMotionAcceleration](x: Self) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
