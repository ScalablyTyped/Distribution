package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200487403Content55422Content421 extends StObject {
  
  var parameters: PathTeamidNumber
  
  var requestBody: ContentApplicationjsonSyncedat
  
  var responses: `200487403Content55422Content421`
}
object Responses200487403Content55422Content421 {
  
  inline def apply(
    parameters: PathTeamidNumber,
    requestBody: ContentApplicationjsonSyncedat,
    responses: `200487403Content55422Content421`
  ): Responses200487403Content55422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200487403Content55422Content421]
  }
  
  extension [Self <: Responses200487403Content55422Content421](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSyncedat): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200487403Content55422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
