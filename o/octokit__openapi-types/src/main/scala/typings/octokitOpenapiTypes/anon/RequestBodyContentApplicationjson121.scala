package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson121 extends StObject {
  
  var parameters: PathCommentnumber
  
  var requestBody: ContentApplicationjson121
  
  var responses: `200Content120`
}
object RequestBodyContentApplicationjson121 {
  
  inline def apply(parameters: PathCommentnumber, requestBody: ContentApplicationjson121, responses: `200Content120`): RequestBodyContentApplicationjson121 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson121]
  }
  
  extension [Self <: RequestBodyContentApplicationjson121](x: Self) {
    
    inline def setParameters(value: PathCommentnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
