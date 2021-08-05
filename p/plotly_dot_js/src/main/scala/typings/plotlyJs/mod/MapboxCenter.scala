package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxCenter extends StObject {
  
  var lat: Double
  
  var lon: Double
}
object MapboxCenter {
  
  inline def apply(lat: Double, lon: Double): MapboxCenter = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxCenter]
  }
  
  extension [Self <: MapboxCenter](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
