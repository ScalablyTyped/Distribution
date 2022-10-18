package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson481 extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var requestBody: ContentApplicationjson481
  
  var responses: `200304400`
}
object RequestBodyContentApplicationjson481 {
  
  inline def apply(
    parameters: PathAlertnumberOwnerRepo,
    requestBody: ContentApplicationjson481,
    responses: `200304400`
  ): RequestBodyContentApplicationjson481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson481]
  }
  
  extension [Self <: RequestBodyContentApplicationjson481](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson481): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
