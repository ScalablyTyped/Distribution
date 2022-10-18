package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTeamreviewers extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonTeamreviewers
  
  var responses: `201ContentApplicationjsonHead`
}
object RequestBodyContentApplicationjsonTeamreviewers {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonTeamreviewers,
    responses: `201ContentApplicationjsonHead`
  ): RequestBodyContentApplicationjsonTeamreviewers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTeamreviewers]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonTeamreviewers](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTeamreviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonHead`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
