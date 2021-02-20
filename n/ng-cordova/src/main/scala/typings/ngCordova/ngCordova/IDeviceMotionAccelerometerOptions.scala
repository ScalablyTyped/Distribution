package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceMotionAccelerometerOptions extends StObject {
  
  var frequency: Double = js.native
}
object IDeviceMotionAccelerometerOptions {
  
  @scala.inline
  def apply(frequency: Double): IDeviceMotionAccelerometerOptions = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceMotionAccelerometerOptions]
  }
  
  @scala.inline
  implicit class IDeviceMotionAccelerometerOptionsMutableBuilder[Self <: IDeviceMotionAccelerometerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
  }
}
