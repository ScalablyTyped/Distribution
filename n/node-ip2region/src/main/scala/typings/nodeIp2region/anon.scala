package typings.nodeIp2region

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait City extends StObject {
    
    var city: Double = js.native
    
    var region: String = js.native
  }
  object City {
    
    @scala.inline
    def apply(city: Double, region: String): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    @scala.inline
    implicit class CityMutableBuilder[Self <: City] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: Double): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DbPath extends StObject {
    
    var dbPath: String = js.native
  }
  object DbPath {
    
    @scala.inline
    def apply(dbPath: String): DbPath = {
      val __obj = js.Dynamic.literal(dbPath = dbPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbPath]
    }
    
    @scala.inline
    implicit class DbPathMutableBuilder[Self <: DbPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
    }
  }
}
