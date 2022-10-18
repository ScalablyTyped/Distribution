package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonReviewersTeamreviewers extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonReviewersTeamreviewers
  
  var responses: `200ContentApplicationjsonHead`
}
object RequestBodyContentApplicationjsonReviewersTeamreviewers {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonReviewersTeamreviewers,
    responses: `200ContentApplicationjsonHead`
  ): RequestBodyContentApplicationjsonReviewersTeamreviewers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonReviewersTeamreviewers]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonReviewersTeamreviewers](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewersTeamreviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonHead`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
