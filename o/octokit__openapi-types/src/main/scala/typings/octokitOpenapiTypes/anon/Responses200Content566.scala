package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content566 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonReviewersTeamreviewers
  
  var responses: `200Content566`
}
object Responses200Content566 {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonReviewersTeamreviewers,
    responses: `200Content566`
  ): Responses200Content566 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content566]
  }
  
  extension [Self <: Responses200Content566](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewersTeamreviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content566`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
