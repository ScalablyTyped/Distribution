package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content116403Unknown extends StObject {
  
  var parameters: PathTeamidUsername
  
  var requestBody: ContentApplicationjson117
  
  var responses: `200Content116403Unknown`
}
object Responses200Content116403Unknown {
  
  inline def apply(
    parameters: PathTeamidUsername,
    requestBody: ContentApplicationjson117,
    responses: `200Content116403Unknown`
  ): Responses200Content116403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content116403Unknown]
  }
  
  extension [Self <: Responses200Content116403Unknown](x: Self) {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson117): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content116403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
