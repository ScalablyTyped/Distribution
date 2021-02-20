package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookieMod {
  
  @js.native
  trait CookieInfo extends StObject {
    
    var domain: String = js.native
    
    var name: String = js.native
    
    var path: String = js.native
  }
  object CookieInfo {
    
    @scala.inline
    def apply(domain: String, name: String, path: String): CookieInfo = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieInfo]
    }
    
    @scala.inline
    implicit class CookieInfoMutableBuilder[Self <: CookieInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CookieOption extends StObject {
    
    var name: String = js.native
  }
  object CookieOption {
    
    @scala.inline
    def apply(name: String): CookieOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieOption]
    }
    
    @scala.inline
    implicit class CookieOptionMutableBuilder[Self <: CookieOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
