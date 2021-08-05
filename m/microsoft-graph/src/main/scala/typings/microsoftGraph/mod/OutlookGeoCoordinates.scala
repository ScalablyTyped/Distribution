package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookGeoCoordinates extends StObject {
  
  /**
    * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude
    * and longitude are accurate to within 50 meters.
    */
  var accuracy: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The altitude of the location.
  var altitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The accuracy of the altitude.
  var altitudeAccuracy: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The latitude of the location.
  var latitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The longitude of the location.
  var longitude: js.UndefOr[NullableOption[Double]] = js.undefined
}
object OutlookGeoCoordinates {
  
  inline def apply(): OutlookGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookGeoCoordinates]
  }
  
  extension [Self <: OutlookGeoCoordinates](x: Self) {
    
    inline def setAccuracy(value: NullableOption[Double]): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setAltitude(value: NullableOption[Double]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: NullableOption[Double]): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    inline def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
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
