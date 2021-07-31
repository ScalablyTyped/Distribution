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
  
  @scala.inline
  def apply(code: Double, responseTime: Double): ResponseDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDefinition]
  }
  
  @scala.inline
  implicit class ResponseDefinitionMutableBuilder[Self <: ResponseDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie(value: js.Array[CookieDefinition]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    @scala.inline
    def setCookieVarargs(value: CookieDefinition*): Self = StObject.set(x, "cookie", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[HeaderDefinition]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: HeaderDefinition*): Self = StObject.set(x, "header", js.Array(value :_*))
    
    @scala.inline
    def setOriginalRequest(value: RequestDefinition): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    @scala.inline
    def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: Buffer | Uint8Array): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
