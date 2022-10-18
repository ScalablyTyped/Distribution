package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccesstoken extends StObject {
  
  var parameters: Path238
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `200Content240`
}
object RequestBodyContentApplicationjsonAccesstoken {
  
  inline def apply(parameters: Path238, requestBody: ContentApplicationjsonAccesstoken, responses: `200Content240`): RequestBodyContentApplicationjsonAccesstoken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccesstoken]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAccesstoken](x: Self) {
    
    inline def setParameters(value: Path238): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content240`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
