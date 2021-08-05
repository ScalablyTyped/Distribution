package typings.momentTimezone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Links extends StObject {
    
    var links: js.Array[String]
    
    var version: String
    
    var zones: js.Array[String]
  }
  object Links {
    
    inline def apply(links: js.Array[String], version: String, zones: js.Array[String]): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    extension [Self <: Links](x: Self) {
      
      inline def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
      
      inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
    }
  }
}
