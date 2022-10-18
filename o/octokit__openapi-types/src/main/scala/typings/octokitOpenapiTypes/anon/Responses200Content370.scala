package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content370 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: ContentApplicationjsonBodyTitle
  
  var responses: `200Content370`
}
object Responses200Content370 {
  
  inline def apply(
    parameters: PathDiscussionnumberOrgTeamslug,
    requestBody: ContentApplicationjsonBodyTitle,
    responses: `200Content370`
  ): Responses200Content370 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content370]
  }
  
  extension [Self <: Responses200Content370](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
