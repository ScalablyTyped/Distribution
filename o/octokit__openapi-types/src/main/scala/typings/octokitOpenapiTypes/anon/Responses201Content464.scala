package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content464 extends StObject {
  
  var parameters: PathOwnerRepoUsername
  
  var requestBody: ContentApplicationjson69
  
  var responses: `201Content464`
}
object Responses201Content464 {
  
  inline def apply(
    parameters: PathOwnerRepoUsername,
    requestBody: ContentApplicationjson69,
    responses: `201Content464`
  ): Responses201Content464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content464]
  }
  
  extension [Self <: Responses201Content464](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson69): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content464`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
