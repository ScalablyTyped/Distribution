package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends StObject {
  
  var cookie: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ js.Any, Unit]] = js.native
  
  var parseUrl: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.native
  
  var requestDefaults: js.UndefOr[requestDefaultsOptions] = js.native
  
  var url: String = js.native
}
object Configuration {
  
  @scala.inline
  def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    @scala.inline
    def setLog(value: (/* id */ String, /* args */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setParseUrl(value: Boolean): Self = StObject.set(x, "parseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUrlUndefined: Self = StObject.set(x, "parseUrl", js.undefined)
    
    @scala.inline
    def setRequest(value: /* params */ js.Any => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestDefaults(value: requestDefaultsOptions): Self = StObject.set(x, "requestDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDefaultsUndefined: Self = StObject.set(x, "requestDefaults", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
