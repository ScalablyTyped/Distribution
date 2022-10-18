package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCommentscount extends StObject {
  
  var parameters: PathTeamid
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201ContentApplicationjsonCommentscount`
}
object Responses201ContentApplicationjsonCommentscount {
  
  inline def apply(
    parameters: PathTeamid,
    requestBody: ContentApplicationjsonPrivate,
    responses: `201ContentApplicationjsonCommentscount`
  ): Responses201ContentApplicationjsonCommentscount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCommentscount]
  }
  
  extension [Self <: Responses201ContentApplicationjsonCommentscount](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
