package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson64 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var requestBody: ContentApplicationjson64
  
  var responses: `403Unknown`
}
object RequestBodyContentApplicationjson64 {
  
  inline def apply(parameters: PathOrgTeamslug, requestBody: ContentApplicationjson64, responses: `403Unknown`): RequestBodyContentApplicationjson64 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson64]
  }
  
  extension [Self <: RequestBodyContentApplicationjson64](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson64): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
