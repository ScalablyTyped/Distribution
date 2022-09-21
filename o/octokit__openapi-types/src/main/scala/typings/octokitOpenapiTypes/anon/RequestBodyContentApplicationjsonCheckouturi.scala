package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonCheckouturi extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonCheckouturi
  
  var responses: `413`
}
object RequestBodyContentApplicationjsonCheckouturi {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonCheckouturi, responses: `413`): RequestBodyContentApplicationjsonCheckouturi = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonCheckouturi]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonCheckouturi](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCheckouturi): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `413`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
