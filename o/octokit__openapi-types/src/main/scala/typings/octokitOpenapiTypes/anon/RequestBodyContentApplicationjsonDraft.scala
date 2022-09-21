package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDraft extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonDraft
  
  var responses: `201Content299`
}
object RequestBodyContentApplicationjsonDraft {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonDraft, responses: `201Content299`): RequestBodyContentApplicationjsonDraft = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDraft]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDraft](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDraft): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content299`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
