package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Nano configuration */
trait Configuration extends StObject {
  
  /** For cookie authentication */
  var cookie: js.UndefOr[String] = js.undefined
  
  /** Logging function 
    * @see README: {@link https://www.npmjs.com/package/nano#logging}
    */
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ Any, Unit]] = js.undefined
  
  /** Set to false to prevent parsing of url 
    * @see README: {@link https://www.npmjs.com/package/nano#configuration}
    */
  var parseUrl: js.UndefOr[Boolean] = js.undefined
  
  /** HTTP request options
    * @see README: {@link https://www.npmjs.com/package/nano#pool-size-and-open-sockets}
    */
  var requestDefaults: js.UndefOr[RequestDefaultsOptions] = js.undefined
  
  /** The URL of the CouchDB service, including username and password if required e.g.
    * http://username:password@hostname:port
    */
  var url: String
}
object Configuration {
  
  inline def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setLog(value: (/* id */ String, /* args */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setParseUrl(value: Boolean): Self = StObject.set(x, "parseUrl", value.asInstanceOf[js.Any])
    
    inline def setParseUrlUndefined: Self = StObject.set(x, "parseUrl", js.undefined)
    
    inline def setRequestDefaults(value: RequestDefaultsOptions): Self = StObject.set(x, "requestDefaults", value.asInstanceOf[js.Any])
    
    inline def setRequestDefaultsUndefined: Self = StObject.set(x, "requestDefaults", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
