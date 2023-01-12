package typings.ngeohash

import typings.ngeohash.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngeohash {
  
  type GeographicBoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  trait GeographicPoint extends StObject {
    
    var error: Latitude
    
    var latitude: Double
    
    var longitude: Double
  }
  object GeographicPoint {
    
    inline def apply(error: Latitude, latitude: Double, longitude: Double): GeographicPoint = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeographicPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeographicPoint] (val x: Self) extends AnyVal {
      
      inline def setError(value: Latitude): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  type NSEW = js.Tuple2[Double, Double]
}
