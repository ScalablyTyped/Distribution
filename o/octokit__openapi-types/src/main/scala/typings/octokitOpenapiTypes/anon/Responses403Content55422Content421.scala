package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content55422Content421 extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var requestBody: ContentApplicationjson358
  
  var responses: `403Content55422Content421`
}
object Responses403Content55422Content421 {
  
  inline def apply(
    parameters: PathOwnerRepoTeamid,
    requestBody: ContentApplicationjson358,
    responses: `403Content55422Content421`
  ): Responses403Content55422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content55422Content421]
  }
  
  extension [Self <: Responses403Content55422Content421](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson358): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content55422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
