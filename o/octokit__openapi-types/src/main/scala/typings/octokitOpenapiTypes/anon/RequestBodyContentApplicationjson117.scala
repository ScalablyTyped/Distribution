package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson117 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var requestBody: ContentApplicationjson117
  
  var responses: `403Unknown`
}
object RequestBodyContentApplicationjson117 {
  
  inline def apply(parameters: PathOrgTeamslug, requestBody: ContentApplicationjson117, responses: `403Unknown`): RequestBodyContentApplicationjson117 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson117]
  }
  
  extension [Self <: RequestBodyContentApplicationjson117](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson117): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
