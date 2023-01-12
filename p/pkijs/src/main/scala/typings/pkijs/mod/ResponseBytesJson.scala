package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBytesJson extends StObject {
  
  var response: OctetStringJson
  
  var responseType: String
}
object ResponseBytesJson {
  
  inline def apply(response: OctetStringJson, responseType: String): ResponseBytesJson = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBytesJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBytesJson] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: OctetStringJson): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}
