package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceGeoLocation extends StObject {
  
  // Altitude, given in meters above sea level
  var altitude: js.UndefOr[Double] = js.native
  
  // Heading in degrees from true north
  var heading: js.UndefOr[Double] = js.native
  
  // Accuracy of longitude and latitude in meters
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  
  // Time at which location was recorded, relative to UTC
  var lastCollectedDateTime: js.UndefOr[String] = js.native
  
  // Latitude coordinate of the device's location
  var latitude: js.UndefOr[Double] = js.native
  
  // Longitude coordinate of the device's location
  var longitude: js.UndefOr[Double] = js.native
  
  // Speed the device is traveling in meters per second
  var speed: js.UndefOr[Double] = js.native
  
  // Accuracy of altitude in meters
  var verticalAccuracy: js.UndefOr[Double] = js.native
}
object DeviceGeoLocation {
  
  @scala.inline
  def apply(): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceGeoLocation]
  }
  
  @scala.inline
  implicit class DeviceGeoLocationMutableBuilder[Self <: DeviceGeoLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAccuracyUndefined: Self = StObject.set(x, "horizontalAccuracy", js.undefined)
    
    @scala.inline
    def setLastCollectedDateTime(value: String): Self = StObject.set(x, "lastCollectedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCollectedDateTimeUndefined: Self = StObject.set(x, "lastCollectedDateTime", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAccuracyUndefined: Self = StObject.set(x, "verticalAccuracy", js.undefined)
  }
}
