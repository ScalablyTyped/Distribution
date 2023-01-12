package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents location information.
  */
trait ILocation extends StObject {
  
  /**
    * The altitude portion of the location, expressed as positive (above)
    * or negative (below) values relative to sea level, in units of
    * measurement as determined by the camera.
    */
  var altitude: Double
  
  /**
    * The latitude portion of the location, expressed as positive (north)
    * or negative (south) degrees relative to the equator.
    */
  var latitude: Double
  
  /**
    * The longitude portion of the location expressed as positive (east) or
    * negative (west) degrees relative to the Prime Meridian.
    */
  var longitude: Double
}
object ILocation {
  
  inline def apply(altitude: Double, latitude: Double, longitude: Double): ILocation = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
