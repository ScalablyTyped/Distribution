package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwtLocation extends StObject {
  
  /** Specifies HTTP header name to extract JWT token. */
  var header: js.UndefOr[String] = js.native
  
  /** Specifies URL query parameter name to extract JWT token. */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case
    * sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}",
    * value_prefix="Bearer " with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.native
}
object JwtLocation {
  
  @scala.inline
  def apply(): JwtLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JwtLocation]
  }
  
  @scala.inline
  implicit class JwtLocationMutableBuilder[Self <: JwtLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
  }
}
