package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content566 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonTeamreviewers
  
  var responses: `201Content566`
}
object Responses201Content566 {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonTeamreviewers,
    responses: `201Content566`
  ): Responses201Content566 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content566]
  }
  
  extension [Self <: Responses201Content566](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTeamreviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content566`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
