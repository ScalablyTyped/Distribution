package typings.nextAuth.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next-auth.next-auth/core.RequestInternal, 'body' | 'query' | 'headers' | 'method'> */
trait PickRequestInternalbodyqu extends StObject {
  
  var body: js.UndefOr[Record[String, Any]] = js.undefined
  
  var headers: js.UndefOr[Record[String, Any]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[Record[String, Any]] = js.undefined
}
object PickRequestInternalbodyqu {
  
  inline def apply(): PickRequestInternalbodyqu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickRequestInternalbodyqu]
  }
  
  extension [Self <: PickRequestInternalbodyqu](x: Self) {
    
    inline def setBody(value: Record[String, Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
