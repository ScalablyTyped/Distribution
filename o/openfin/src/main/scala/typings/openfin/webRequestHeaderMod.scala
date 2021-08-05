package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequestHeaderMod {
  
  type WebRequestHeader = StringDictionary[String]
  
  trait WebRequestHeaderConfig extends StObject {
    
    var headers: js.Array[WebRequestHeader]
    
    var urlPatterns: js.Array[String]
  }
  object WebRequestHeaderConfig {
    
    inline def apply(headers: js.Array[WebRequestHeader], urlPatterns: js.Array[String]): WebRequestHeaderConfig = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRequestHeaderConfig]
    }
    
    extension [Self <: WebRequestHeaderConfig](x: Self) {
      
      inline def setHeaders(value: js.Array[WebRequestHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: WebRequestHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "urlPatterns", value.asInstanceOf[js.Any])
      
      inline def setUrlPatternsVarargs(value: String*): Self = StObject.set(x, "urlPatterns", js.Array(value :_*))
    }
  }
}
