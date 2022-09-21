package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson125 extends StObject {
  
  var parameters: PathOrgTeamslug
  
  var requestBody: ContentApplicationjson125
  
  var responses: `403Unknown`
}
object RequestBodyContentApplicationjson125 {
  
  inline def apply(parameters: PathOrgTeamslug, requestBody: ContentApplicationjson125, responses: `403Unknown`): RequestBodyContentApplicationjson125 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson125]
  }
  
  extension [Self <: RequestBodyContentApplicationjson125](x: Self) {
    
    inline def setParameters(value: PathOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson125): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
