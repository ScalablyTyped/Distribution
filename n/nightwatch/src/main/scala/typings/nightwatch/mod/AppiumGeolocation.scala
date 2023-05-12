package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumGeolocation extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
}
object AppiumGeolocation {
  
  inline def apply(latitude: Double, longitude: Double): AppiumGeolocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppiumGeolocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppiumGeolocation] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
