package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters115 extends StObject {
  
  var parameters: `115`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `409422`
}
object Parameters115 {
  
  inline def apply(parameters: `115`, requestBody: ContentApplicationjsonAuthorBranch, responses: `409422`): Parameters115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters115]
  }
  
  extension [Self <: Parameters115](x: Self) {
    
    inline def setParameters(value: `115`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
