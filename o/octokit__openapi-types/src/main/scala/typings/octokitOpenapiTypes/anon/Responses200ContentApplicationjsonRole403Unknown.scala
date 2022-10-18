package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRole403Unknown extends StObject {
  
  var parameters: PathTeamidUsername
  
  var requestBody: ContentApplicationjson64
  
  var responses: `200ContentApplicationjsonRole403Unknown`
}
object Responses200ContentApplicationjsonRole403Unknown {
  
  inline def apply(
    parameters: PathTeamidUsername,
    requestBody: ContentApplicationjson64,
    responses: `200ContentApplicationjsonRole403Unknown`
  ): Responses200ContentApplicationjsonRole403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRole403Unknown]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRole403Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson64): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRole403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
