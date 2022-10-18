package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409422503 extends StObject {
  
  var parameters: `476`
  
  var requestBody: ContentApplicationjsonBranchCommitter
  
  var responses: `409422503`
}
object Responses409422503 {
  
  inline def apply(parameters: `476`, requestBody: ContentApplicationjsonBranchCommitter, responses: `409422503`): Responses409422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409422503]
  }
  
  extension [Self <: Responses409422503](x: Self) {
    
    inline def setParameters(value: `476`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBranchCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
