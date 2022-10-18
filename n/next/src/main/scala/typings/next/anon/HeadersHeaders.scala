package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersHeaders extends StObject {
  
  var headers: typings.std.Headers
}
object HeadersHeaders {
  
  inline def apply(headers: typings.std.Headers): HeadersHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersHeaders]
  }
  
  extension [Self <: HeadersHeaders](x: Self) {
    
    inline def setHeaders(value: typings.std.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
