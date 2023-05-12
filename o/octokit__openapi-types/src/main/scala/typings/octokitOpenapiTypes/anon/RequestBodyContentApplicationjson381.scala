package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson381 extends StObject {
  
  var requestBody: ContentApplicationjson381
  
  var responses: `200Content382`
}
object RequestBodyContentApplicationjson381 {
  
  inline def apply(requestBody: ContentApplicationjson381, responses: `200Content382`): RequestBodyContentApplicationjson381 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson381] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson381): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content382`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
