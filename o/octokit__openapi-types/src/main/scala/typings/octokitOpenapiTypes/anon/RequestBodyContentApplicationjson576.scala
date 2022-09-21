package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson576 extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var requestBody: ContentApplicationjson576
  
  var responses: `200404422503`
}
object RequestBodyContentApplicationjson576 {
  
  inline def apply(
    parameters: PathAlertnumberOwner,
    requestBody: ContentApplicationjson576,
    responses: `200404422503`
  ): RequestBodyContentApplicationjson576 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson576]
  }
  
  extension [Self <: RequestBodyContentApplicationjson576](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson576): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
