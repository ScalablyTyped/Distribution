package typings.postmanCollection.mod

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDefinition
  extends StObject
     with PropertyDefinition {
  
  var body: js.UndefOr[String] = js.undefined
  
  var code: Double
  
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.undefined
  
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  
  var originalRequest: js.UndefOr[RequestDefinition] = js.undefined
  
  var responseTime: Double
  
  var stream: js.UndefOr[Buffer | Uint8Array] = js.undefined
}
object ResponseDefinition {
  
  inline def apply(code: Double, responseTime: Double): ResponseDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDefinition]
  }
  
  extension [Self <: ResponseDefinition](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCookie(value: js.Array[CookieDefinition]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setCookieVarargs(value: CookieDefinition*): Self = StObject.set(x, "cookie", js.Array(value :_*))
    
    inline def setHeader(value: js.Array[HeaderDefinition]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: HeaderDefinition*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    inline def setOriginalRequest(value: RequestDefinition): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Buffer | Uint8Array): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
