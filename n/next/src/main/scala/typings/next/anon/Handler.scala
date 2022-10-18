package typings.next.anon

import typings.next.distServerWebSpecExtensionFetchEventMod.NextFetchEvent
import typings.next.distServerWebSpecExtensionRequestMod.NextRequest
import typings.next.distServerWebTypesMod.NextMiddleware
import typings.next.distServerWebTypesMod.NextMiddlewareResult
import typings.next.distServerWebTypesMod.RequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var handler: NextMiddleware
  
  var page: String
  
  var request: RequestData
}
object Handler {
  
  inline def apply(
    handler: (/* request */ NextRequest, /* event */ NextFetchEvent) => NextMiddlewareResult | js.Promise[NextMiddlewareResult],
    page: String,
    request: RequestData
  ): Handler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), page = page.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setHandler(
      value: (/* request */ NextRequest, /* event */ NextFetchEvent) => NextMiddlewareResult | js.Promise[NextMiddlewareResult]
    ): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
