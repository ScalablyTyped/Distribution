package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCommentscount extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjsonBodyTitle
  
  var responses: `200ContentApplicationjsonCommentscount`
}
object Responses200ContentApplicationjsonCommentscount {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjsonBodyTitle,
    responses: `200ContentApplicationjsonCommentscount`
  ): Responses200ContentApplicationjsonCommentscount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCommentscount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCommentscount](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
