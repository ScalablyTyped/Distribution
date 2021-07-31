package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeSeconds extends StObject {
  
  /** The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses. */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  
  /** The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method". */
  var method: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin". */
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains. */
  var responseHeader: js.UndefOr[js.Array[String]] = js.undefined
}
object MaxAgeSeconds {
  
  @scala.inline
  def apply(): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAgeSeconds]
  }
  
  @scala.inline
  implicit class MaxAgeSecondsMutableBuilder[Self <: MaxAgeSeconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeader(value: js.Array[String]): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    @scala.inline
    def setResponseHeaderVarargs(value: String*): Self = StObject.set(x, "responseHeader", js.Array(value :_*))
  }
}
