package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters476 extends StObject {
  
  var parameters: `476`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `200201404`
}
object Parameters476 {
  
  inline def apply(parameters: `476`, requestBody: ContentApplicationjsonAuthorBranch, responses: `200201404`): Parameters476 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters476]
  }
  
  extension [Self <: Parameters476](x: Self) {
    
    inline def setParameters(value: `476`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
