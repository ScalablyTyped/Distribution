package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonMessageUrl extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: Content175
  
  var responses: `202ContentApplicationjsonMessageUrl`
}
object Responses202ContentApplicationjsonMessageUrl {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: Content175,
    responses: `202ContentApplicationjsonMessageUrl`
  ): Responses202ContentApplicationjsonMessageUrl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonMessageUrl]
  }
  
  extension [Self <: Responses202ContentApplicationjsonMessageUrl](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content175): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202ContentApplicationjsonMessageUrl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
