package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonMembers extends StObject {
  
  var parameters: PathTeamslugString
  
  var requestBody: ContentApplicationjsonGroupidNumber
  
  var responses: `200ContentApplicationjsonMembers`
}
object Responses200ContentApplicationjsonMembers {
  
  inline def apply(
    parameters: PathTeamslugString,
    requestBody: ContentApplicationjsonGroupidNumber,
    responses: `200ContentApplicationjsonMembers`
  ): Responses200ContentApplicationjsonMembers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonMembers]
  }
  
  extension [Self <: Responses200ContentApplicationjsonMembers](x: Self) {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGroupidNumber): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMembers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
