package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var ReadableStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any
  
  var Response: TypeofResponse
}
object Response {
  
  inline def apply(
    ReadableStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any,
    Response: TypeofResponse
  ): Response = {
    val __obj = js.Dynamic.literal(ReadableStream = ReadableStream.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setReadableStream(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any): Self = StObject.set(x, "ReadableStream", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: TypeofResponse): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
