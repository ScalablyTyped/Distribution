package typings.nextAuth.anon

import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Map
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var cookies: js.UndefOr[Partial[(Record[String, String]) | (Map[String, String])]] = js.undefined
  
  var headers: js.UndefOr[typings.std.Headers | IncomingHttpHeaders | (Record[String, String])] = js.undefined
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setCookies(value: Partial[(Record[String, String]) | (Map[String, String])]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setHeaders(value: typings.std.Headers | IncomingHttpHeaders | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
