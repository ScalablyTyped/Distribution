package typings.ngeohash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngeohash {
  
  type GeographicBoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  trait GeographicPoint extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object GeographicPoint {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): GeographicPoint = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeographicPoint]
    }
    
    @scala.inline
    implicit class GeographicPointMutableBuilder[Self <: GeographicPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  type NSEW = js.Tuple2[Double, Double]
}
