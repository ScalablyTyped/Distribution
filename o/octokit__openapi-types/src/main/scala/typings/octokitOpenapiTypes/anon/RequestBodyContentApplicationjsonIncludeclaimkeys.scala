package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIncludeclaimkeys extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonIncludeclaimkeys
  
  var responses: `201Content47403Content55`
}
object RequestBodyContentApplicationjsonIncludeclaimkeys {
  
  inline def apply(
    parameters: PathOrgString,
    requestBody: ContentApplicationjsonIncludeclaimkeys,
    responses: `201Content47403Content55`
  ): RequestBodyContentApplicationjsonIncludeclaimkeys = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIncludeclaimkeys]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonIncludeclaimkeys](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content47403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
