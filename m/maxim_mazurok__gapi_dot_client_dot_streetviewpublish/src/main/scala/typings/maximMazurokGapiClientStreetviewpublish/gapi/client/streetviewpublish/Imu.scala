package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imu extends StObject {
  
  /** The accelerometer measurements in meters/sec^2 with increasing timestamps from devices. */
  var accelMpsps: js.UndefOr[js.Array[Measurement3d]] = js.undefined
  
  /** The gyroscope measurements in radians/sec with increasing timestamps from devices. */
  var gyroRps: js.UndefOr[js.Array[Measurement3d]] = js.undefined
  
  /** The magnetometer measurements of the magnetic field in microtesla (uT) with increasing timestamps from devices. */
  var magUt: js.UndefOr[js.Array[Measurement3d]] = js.undefined
}
object Imu {
  
  inline def apply(): Imu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Imu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Imu] (val x: Self) extends AnyVal {
    
    inline def setAccelMpsps(value: js.Array[Measurement3d]): Self = StObject.set(x, "accelMpsps", value.asInstanceOf[js.Any])
    
    inline def setAccelMpspsUndefined: Self = StObject.set(x, "accelMpsps", js.undefined)
    
    inline def setAccelMpspsVarargs(value: Measurement3d*): Self = StObject.set(x, "accelMpsps", js.Array(value*))
    
    inline def setGyroRps(value: js.Array[Measurement3d]): Self = StObject.set(x, "gyroRps", value.asInstanceOf[js.Any])
    
    inline def setGyroRpsUndefined: Self = StObject.set(x, "gyroRps", js.undefined)
    
    inline def setGyroRpsVarargs(value: Measurement3d*): Self = StObject.set(x, "gyroRps", js.Array(value*))
    
    inline def setMagUt(value: js.Array[Measurement3d]): Self = StObject.set(x, "magUt", value.asInstanceOf[js.Any])
    
    inline def setMagUtUndefined: Self = StObject.set(x, "magUt", js.undefined)
    
    inline def setMagUtVarargs(value: Measurement3d*): Self = StObject.set(x, "magUt", js.Array(value*))
  }
}
