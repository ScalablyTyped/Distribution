package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses368 extends StObject {
  
  var parameters: Path366
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `368`
}
object Responses368 {
  
  inline def apply(parameters: Path366, requestBody: ContentApplicationjsonSelectedrepositoryids, responses: `368`): Responses368 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses368]
  }
  
  extension [Self <: Responses368](x: Self) {
    
    inline def setParameters(value: Path366): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
