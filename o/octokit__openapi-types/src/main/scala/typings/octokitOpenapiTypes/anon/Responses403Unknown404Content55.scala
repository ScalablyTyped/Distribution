package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Unknown404Content55 extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var requestBody: ContentApplicationjson125
  
  var responses: `403Unknown404Content55`
}
object Responses403Unknown404Content55 {
  
  inline def apply(
    parameters: PathTeamidNumberUsernameString,
    requestBody: ContentApplicationjson125,
    responses: `403Unknown404Content55`
  ): Responses403Unknown404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Unknown404Content55]
  }
  
  extension [Self <: Responses403Unknown404Content55](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson125): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Unknown404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
