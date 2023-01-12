package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson114 extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjson114
  
  var responses: `200Content113`
}
object RequestBodyContentApplicationjson114 {
  
  inline def apply(parameters: PathCommentnumber, requestBody: ContentApplicationjson114, responses: `200Content113`): RequestBodyContentApplicationjson114 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson114]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson114] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson114): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
