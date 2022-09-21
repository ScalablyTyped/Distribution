package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measurement3d extends StObject {
  
  /** The timestamp of the IMU measurement. */
  var captureTime: js.UndefOr[String] = js.undefined
  
  /** The sensor measurement in the x axis. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** The sensor measurement in the y axis. */
  var y: js.UndefOr[Double] = js.undefined
  
  /** The sensor measurement in the z axis. */
  var z: js.UndefOr[Double] = js.undefined
}
object Measurement3d {
  
  inline def apply(): Measurement3d = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Measurement3d]
  }
  
  extension [Self <: Measurement3d](x: Self) {
    
    inline def setCaptureTime(value: String): Self = StObject.set(x, "captureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "captureTime", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
