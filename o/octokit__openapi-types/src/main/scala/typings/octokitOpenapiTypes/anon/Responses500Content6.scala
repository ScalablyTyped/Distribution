package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses500Content6 extends StObject {
  
  var parameters: PathSecretnameString
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `500Content6`
}
object Responses500Content6 {
  
  inline def apply(
    parameters: PathSecretnameString,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `500Content6`
  ): Responses500Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses500Content6]
  }
  
  extension [Self <: Responses500Content6](x: Self) {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
