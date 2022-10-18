package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200201403 extends StObject {
  
  var parameters: Path364
  
  var requestBody: ContentApplicationjsonParentteamid
  
  var responses: `200201403`
}
object Responses200201403 {
  
  inline def apply(parameters: Path364, requestBody: ContentApplicationjsonParentteamid, responses: `200201403`): Responses200201403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200201403]
  }
  
  extension [Self <: Responses200201403](x: Self) {
    
    inline def setParameters(value: Path364): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParentteamid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
