package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyprefix extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonKeyprefix
  
  var responses: `201422`
}
object RequestBodyContentApplicationjsonKeyprefix {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonKeyprefix, responses: `201422`): RequestBodyContentApplicationjsonKeyprefix = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyprefix]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonKeyprefix](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyprefix): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
