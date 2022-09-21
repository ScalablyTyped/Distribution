package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPrivacy extends StObject {
  
  var parameters: PathTeamid
  
  var requestBody: ContentApplicationjsonPrivacy
  
  var responses: `200201`
}
object RequestBodyContentApplicationjsonPrivacy {
  
  inline def apply(parameters: PathTeamid, requestBody: ContentApplicationjsonPrivacy, responses: `200201`): RequestBodyContentApplicationjsonPrivacy = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPrivacy]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPrivacy](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivacy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
