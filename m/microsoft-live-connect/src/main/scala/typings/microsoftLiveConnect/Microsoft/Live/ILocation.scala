package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents location information.
  */
@js.native
trait ILocation extends StObject {
  
  /**
    * The altitude portion of the location, expressed as positive (above)
    * or negative (below) values relative to sea level, in units of
    * measurement as determined by the camera.
    */
  var altitude: Double = js.native
  
  /**
    * The latitude portion of the location, expressed as positive (north)
    * or negative (south) degrees relative to the equator.
    */
  var latitude: Double = js.native
  
  /**
    * The longitude portion of the location expressed as positive (east) or
    * negative (west) degrees relative to the Prime Meridian.
    */
  var longitude: Double = js.native
}
object ILocation {
  
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): ILocation = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  
  @scala.inline
  implicit class ILocationMutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
