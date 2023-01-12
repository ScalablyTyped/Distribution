package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoCoordinates extends StObject {
  
  // Optional. The altitude (height), in feet, above sea level for the item. Read-only.
  var altitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Optional. The latitude, in decimal, for the item. Read-only.
  var latitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Optional. The longitude, in decimal, for the item. Read-only.
  var longitude: js.UndefOr[NullableOption[Double]] = js.undefined
}
object GeoCoordinates {
  
  inline def apply(): GeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoCoordinates] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: NullableOption[Double]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: NullableOption[Double]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: NullableOption[Double]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
