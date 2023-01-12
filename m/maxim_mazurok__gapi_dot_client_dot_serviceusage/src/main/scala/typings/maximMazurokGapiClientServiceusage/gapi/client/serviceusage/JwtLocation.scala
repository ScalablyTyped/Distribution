package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwtLocation extends StObject {
  
  /** Specifies cookie name to extract JWT token. */
  var cookie: js.UndefOr[String] = js.undefined
  
  /** Specifies HTTP header name to extract JWT token. */
  var header: js.UndefOr[String] = js.undefined
  
  /** Specifies URL query parameter name to extract JWT token. */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case
    * sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}",
    * value_prefix="Bearer " with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
}
object JwtLocation {
  
  inline def apply(): JwtLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JwtLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JwtLocation] (val x: Self) extends AnyVal {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}
