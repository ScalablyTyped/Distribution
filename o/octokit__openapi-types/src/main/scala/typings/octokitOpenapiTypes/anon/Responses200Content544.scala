package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content544 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonBranchString
  
  var responses: `200Content544`
}
object Responses200Content544 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonBranchString, responses: `200Content544`): Responses200Content544 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content544]
  }
  
  extension [Self <: Responses200Content544](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBranchString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content544`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
