package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersPayload extends StObject {
  
  /** @description The response headers received when the delivery was made. */
  var headers: StringDictionary[Any] | Null
  
  /** @description The response payload received. */
  var payload: String | Null
}
object HeadersPayload {
  
  inline def apply(): HeadersPayload = {
    val __obj = js.Dynamic.literal(headers = null, payload = null)
    __obj.asInstanceOf[HeadersPayload]
  }
  
  extension [Self <: HeadersPayload](x: Self) {
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
  }
}
