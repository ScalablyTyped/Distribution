package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmail extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonEmail
  
  var responses: `201Content89`
}
object RequestBodyContentApplicationjsonEmail {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjsonEmail, responses: `201Content89`): RequestBodyContentApplicationjsonEmail = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmail]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEmail](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmail): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content89`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
