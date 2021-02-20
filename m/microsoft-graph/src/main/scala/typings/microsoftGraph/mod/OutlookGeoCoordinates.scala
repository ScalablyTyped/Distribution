package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookGeoCoordinates extends StObject {
  
  /**
    * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude
    * and longitude are accurate to within 50 meters.
    */
  var accuracy: js.UndefOr[NullableOption[Double]] = js.native
  
  // The altitude of the location.
  var altitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // The accuracy of the altitude.
  var altitudeAccuracy: js.UndefOr[NullableOption[Double]] = js.native
  
  // The latitude of the location.
  var latitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // The longitude of the location.
  var longitude: js.UndefOr[NullableOption[Double]] = js.native
}
object OutlookGeoCoordinates {
  
  @scala.inline
  def apply(): OutlookGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookGeoCoordinates]
  }
  
  @scala.inline
  implicit class OutlookGeoCoordinatesMutableBuilder[Self <: OutlookGeoCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: NullableOption[Double]): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAltitude(value: NullableOption[Double]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: NullableOption[Double]): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    @scala.inline
    def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    @scala.inline
    def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: NullableOption[Double]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: NullableOption[Double]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
