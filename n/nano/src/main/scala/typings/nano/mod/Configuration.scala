package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var cookie: js.UndefOr[String] = js.undefined
  
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ js.Any, Unit]] = js.undefined
  
  var parseUrl: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
  
  var requestDefaults: js.UndefOr[requestDefaultsOptions] = js.undefined
  
  var url: String
}
object Configuration {
  
  inline def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setLog(value: (/* id */ String, /* args */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setParseUrl(value: Boolean): Self = StObject.set(x, "parseUrl", value.asInstanceOf[js.Any])
    
    inline def setParseUrlUndefined: Self = StObject.set(x, "parseUrl", js.undefined)
    
    inline def setRequest(value: /* params */ js.Any => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    inline def setRequestDefaults(value: requestDefaultsOptions): Self = StObject.set(x, "requestDefaults", value.asInstanceOf[js.Any])
    
    inline def setRequestDefaultsUndefined: Self = StObject.set(x, "requestDefaults", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
