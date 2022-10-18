package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonResolutionResolutioncomment extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var requestBody: ContentApplicationjsonResolutionResolutioncomment
  
  var responses: `404422503`
}
object RequestBodyContentApplicationjsonResolutionResolutioncomment {
  
  inline def apply(
    parameters: PathAlertnumberOwner,
    requestBody: ContentApplicationjsonResolutionResolutioncomment,
    responses: `404422503`
  ): RequestBodyContentApplicationjsonResolutionResolutioncomment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonResolutionResolutioncomment]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonResolutionResolutioncomment](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonResolutionResolutioncomment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
