package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEnvironmentids extends StObject {
  
  var parameters: `80`
  
  var requestBody: ContentApplicationjsonEnvironmentids
  
  var responses: `200Content87`
}
object RequestBodyContentApplicationjsonEnvironmentids {
  
  inline def apply(parameters: `80`, requestBody: ContentApplicationjsonEnvironmentids, responses: `200Content87`): RequestBodyContentApplicationjsonEnvironmentids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEnvironmentids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEnvironmentids](x: Self) {
    
    inline def setParameters(value: `80`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEnvironmentids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content87`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
