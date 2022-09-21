package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200404409 extends StObject {
  
  var parameters: `525`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `200404409`
}
object Responses200404409 {
  
  inline def apply(parameters: `525`, requestBody: ContentApplicationjsonAuthorBranch, responses: `200404409`): Responses200404409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200404409]
  }
  
  extension [Self <: Responses200404409](x: Self) {
    
    inline def setParameters(value: `525`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
