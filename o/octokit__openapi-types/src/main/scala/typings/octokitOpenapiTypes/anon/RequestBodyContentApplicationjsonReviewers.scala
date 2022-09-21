package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonReviewers extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonReviewers
  
  var responses: `201Content313`
}
object RequestBodyContentApplicationjsonReviewers {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonReviewers,
    responses: `201Content313`
  ): RequestBodyContentApplicationjsonReviewers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonReviewers]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonReviewers](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content313`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
