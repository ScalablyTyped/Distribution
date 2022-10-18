package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content379403Unknown extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var requestBody: ContentApplicationjson64
  
  var responses: `200Content379403Unknown`
}
object Responses200Content379403Unknown {
  
  inline def apply(
    parameters: PathTeamslugUsername,
    requestBody: ContentApplicationjson64,
    responses: `200Content379403Unknown`
  ): Responses200Content379403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content379403Unknown]
  }
  
  extension [Self <: Responses200Content379403Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson64): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content379403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
