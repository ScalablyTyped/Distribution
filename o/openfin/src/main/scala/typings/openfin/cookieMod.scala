package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookieMod {
  
  trait CookieInfo extends StObject {
    
    var domain: String
    
    var name: String
    
    var path: String
  }
  object CookieInfo {
    
    inline def apply(domain: String, name: String, path: String): CookieInfo = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieInfo]
    }
    
    extension [Self <: CookieInfo](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CookieOption extends StObject {
    
    var name: String
  }
  object CookieOption {
    
    inline def apply(name: String): CookieOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieOption]
    }
    
    extension [Self <: CookieOption](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
