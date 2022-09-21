package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSchemas extends StObject {
  
  var parameters: PathScimuserid
  
  var requestBody: ContentApplicationjsonSchemas
  
  var responses: `200Content353`
}
object RequestBodyContentApplicationjsonSchemas {
  
  inline def apply(parameters: PathScimuserid, requestBody: ContentApplicationjsonSchemas, responses: `200Content353`): RequestBodyContentApplicationjsonSchemas = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSchemas]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSchemas](x: Self) {
    
    inline def setParameters(value: PathScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSchemas): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content353`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
