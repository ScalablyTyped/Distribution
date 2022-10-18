package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameParentteamid extends StObject {
  
  var parameters: PathTeamid
  
  var requestBody: ContentApplicationjsonNameParentteamid
  
  var responses: `200201`
}
object RequestBodyContentApplicationjsonNameParentteamid {
  
  inline def apply(parameters: PathTeamid, requestBody: ContentApplicationjsonNameParentteamid, responses: `200201`): RequestBodyContentApplicationjsonNameParentteamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameParentteamid]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNameParentteamid](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameParentteamid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
