package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Altitude extends StObject {
  
  /** The altitude stored in the image. */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /** The latitude stored in the image. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** The longitude stored in the image. */
  var longitude: js.UndefOr[Double] = js.undefined
}
object Altitude {
  
  inline def apply(): Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Altitude]
  }
  
  extension [Self <: Altitude](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
