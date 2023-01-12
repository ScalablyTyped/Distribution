package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRoleState403Unknown extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var requestBody: ContentApplicationjson117
  
  var responses: `200ContentApplicationjsonRoleState403Unknown`
}
object Responses200ContentApplicationjsonRoleState403Unknown {
  
  inline def apply(
    parameters: PathTeamslugUsername,
    requestBody: ContentApplicationjson117,
    responses: `200ContentApplicationjsonRoleState403Unknown`
  ): Responses200ContentApplicationjsonRoleState403Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRoleState403Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRoleState403Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson117): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRoleState403Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
