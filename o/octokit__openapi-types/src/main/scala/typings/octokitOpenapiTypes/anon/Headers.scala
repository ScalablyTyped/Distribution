package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  /** @description The request headers sent with the webhook delivery. */
  var headers: StringDictionary[Any] | Null
  
  /** @description The webhook payload. */
  var payload: StringDictionary[Any] | Null
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal(headers = null, payload = null)
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
  }
}
