package typings.nodeIp2region

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait City extends StObject {
    
    var city: Double
    
    var region: String
  }
  object City {
    
    inline def apply(city: Double, region: String): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    extension [Self <: City](x: Self) {
      
      inline def setCity(value: Double): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait DbPath extends StObject {
    
    var dbPath: String
  }
  object DbPath {
    
    inline def apply(dbPath: String): DbPath = {
      val __obj = js.Dynamic.literal(dbPath = dbPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbPath]
    }
    
    extension [Self <: DbPath](x: Self) {
      
      inline def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
    }
  }
}
