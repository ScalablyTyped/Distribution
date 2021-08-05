package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceMotionAccelerometerOptions extends StObject {
  
  var frequency: Double
}
object IDeviceMotionAccelerometerOptions {
  
  inline def apply(frequency: Double): IDeviceMotionAccelerometerOptions = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceMotionAccelerometerOptions]
  }
  
  extension [Self <: IDeviceMotionAccelerometerOptions](x: Self) {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
  }
}
