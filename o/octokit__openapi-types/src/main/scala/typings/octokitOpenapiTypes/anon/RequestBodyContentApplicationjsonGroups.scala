package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonGroups extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: ContentApplicationjsonGroups
  
  var responses: `200132`
}
object RequestBodyContentApplicationjsonGroups {
  
  inline def apply(parameters: PathTeamslug, requestBody: ContentApplicationjsonGroups, responses: `200132`): RequestBodyContentApplicationjsonGroups = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonGroups]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonGroups](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200132`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
