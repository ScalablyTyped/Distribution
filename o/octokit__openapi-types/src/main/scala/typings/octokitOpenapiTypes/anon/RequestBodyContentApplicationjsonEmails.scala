package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEmails extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `201Content353`
}
object RequestBodyContentApplicationjsonEmails {
  
  inline def apply(parameters: PathEnterprise, requestBody: ContentApplicationjsonEmails, responses: `201Content353`): RequestBodyContentApplicationjsonEmails = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEmails]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEmails](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content353`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
