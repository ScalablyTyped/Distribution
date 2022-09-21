package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson358 extends StObject {
  
  var parameters: PathRepoTeamid
  
  var requestBody: ContentApplicationjson358
  
  var responses: `357`
}
object RequestBodyContentApplicationjson358 {
  
  inline def apply(parameters: PathRepoTeamid, requestBody: ContentApplicationjson358, responses: `357`): RequestBodyContentApplicationjson358 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson358]
  }
  
  extension [Self <: RequestBodyContentApplicationjson358](x: Self) {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson358): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `357`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
