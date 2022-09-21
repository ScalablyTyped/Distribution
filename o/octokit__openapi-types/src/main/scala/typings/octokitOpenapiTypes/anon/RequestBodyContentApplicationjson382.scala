package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson382 extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjson382
  
  var responses: `200Content94403`
}
object RequestBodyContentApplicationjson382 {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjson382, responses: `200Content94403`): RequestBodyContentApplicationjson382 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson382]
  }
  
  extension [Self <: RequestBodyContentApplicationjson382](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson382): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content94403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
