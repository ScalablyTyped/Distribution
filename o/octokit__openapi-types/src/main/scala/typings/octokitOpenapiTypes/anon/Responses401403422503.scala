package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403422503 extends StObject {
  
  var parameters: Path384
  
  var requestBody: ContentApplicationjsonColumnid
  
  var responses: `401403422503`
}
object Responses401403422503 {
  
  inline def apply(parameters: Path384, requestBody: ContentApplicationjsonColumnid, responses: `401403422503`): Responses401403422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403422503]
  }
  
  extension [Self <: Responses401403422503](x: Self) {
    
    inline def setParameters(value: Path384): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColumnid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
