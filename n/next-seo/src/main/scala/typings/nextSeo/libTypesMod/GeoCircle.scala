package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoCircle extends StObject {
  
  var geoMidpoint: Geo
  
  var geoRadius: String
}
object GeoCircle {
  
  inline def apply(geoMidpoint: Geo, geoRadius: String): GeoCircle = {
    val __obj = js.Dynamic.literal(geoMidpoint = geoMidpoint.asInstanceOf[js.Any], geoRadius = geoRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoCircle]
  }
  
  extension [Self <: GeoCircle](x: Self) {
    
    inline def setGeoMidpoint(value: Geo): Self = StObject.set(x, "geoMidpoint", value.asInstanceOf[js.Any])
    
    inline def setGeoRadius(value: String): Self = StObject.set(x, "geoRadius", value.asInstanceOf[js.Any])
  }
}
