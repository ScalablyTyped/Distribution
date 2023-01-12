package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTeamreviewers extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonTeamreviewers
  
  var responses: `200Content308`
}
object RequestBodyContentApplicationjsonTeamreviewers {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonTeamreviewers,
    responses: `200Content308`
  ): RequestBodyContentApplicationjsonTeamreviewers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTeamreviewers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonTeamreviewers] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTeamreviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content308`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
