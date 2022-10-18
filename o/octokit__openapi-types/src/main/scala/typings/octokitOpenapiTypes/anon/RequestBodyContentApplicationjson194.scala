package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson194 extends StObject {
  
  var parameters: PathRepoTeamid
  
  var requestBody: ContentApplicationjson194
  
  var responses: `403Content6422Content8`
}
object RequestBodyContentApplicationjson194 {
  
  inline def apply(
    parameters: PathRepoTeamid,
    requestBody: ContentApplicationjson194,
    responses: `403Content6422Content8`
  ): RequestBodyContentApplicationjson194 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson194]
  }
  
  extension [Self <: RequestBodyContentApplicationjson194](x: Self) {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson194): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content6422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
