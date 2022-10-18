package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyComments extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonBodyComments
  
  var responses: `200ContentApplicationjsonBodyBodyhtml`
}
object RequestBodyContentApplicationjsonBodyComments {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonBodyComments,
    responses: `200ContentApplicationjsonBodyBodyhtml`
  ): RequestBodyContentApplicationjsonBodyComments = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyComments]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyComments](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyBodyhtml`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
