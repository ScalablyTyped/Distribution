package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoPoint extends StObject {
  
  /** Altitude above the reference ellipsoid, in meters. */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /** Latitude in degrees. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** Longitude in degrees. */
  var longitude: js.UndefOr[Double] = js.undefined
}
object GeoPoint {
  
  inline def apply(): GeoPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoPoint] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
