package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content124403Unknown extends StObject {
  
  var parameters: PathTeamidUsername
  
  var requestBody: ContentApplicationjson125
  
  var responses: `200Content124403Unknown`
}
object Responses200Content124403Unknown {
  
  inline def apply(
    parameters: PathTeamidUsername,
    requestBody: ContentApplicationjson125,
    responses: `200Content124403Unknown`
  ): Responses200Content124403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content124403Unknown]
  }
  
  extension [Self <: Responses200Content124403Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson125): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content124403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
