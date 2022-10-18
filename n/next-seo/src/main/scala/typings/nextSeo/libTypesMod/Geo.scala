package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geo extends StObject {
  
  var latitude: String
  
  var longitude: String
}
object Geo {
  
  inline def apply(latitude: String, longitude: String): Geo = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
  
  extension [Self <: Geo](x: Self) {
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
