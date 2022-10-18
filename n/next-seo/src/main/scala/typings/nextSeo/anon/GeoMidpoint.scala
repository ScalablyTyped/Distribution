package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMidpoint extends StObject {
  
  var `@type`: String
  
  var geoMidpoint: Latitude
  
  var geoRadius: String
}
object GeoMidpoint {
  
  inline def apply(`@type`: String, geoMidpoint: Latitude, geoRadius: String): GeoMidpoint = {
    val __obj = js.Dynamic.literal(geoMidpoint = geoMidpoint.asInstanceOf[js.Any], geoRadius = geoRadius.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMidpoint]
  }
  
  extension [Self <: GeoMidpoint](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setGeoMidpoint(value: Latitude): Self = StObject.set(x, "geoMidpoint", value.asInstanceOf[js.Any])
    
    inline def setGeoRadius(value: String): Self = StObject.set(x, "geoRadius", value.asInstanceOf[js.Any])
  }
}
