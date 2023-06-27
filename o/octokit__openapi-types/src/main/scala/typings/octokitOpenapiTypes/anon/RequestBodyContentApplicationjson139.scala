package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjson139
  
  var responses: `200Content140`
}
object RequestBodyContentApplicationjson139 {
  
  inline def apply(parameters: PathCommentnumber, requestBody: ContentApplicationjson139, responses: `200Content140`): RequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
