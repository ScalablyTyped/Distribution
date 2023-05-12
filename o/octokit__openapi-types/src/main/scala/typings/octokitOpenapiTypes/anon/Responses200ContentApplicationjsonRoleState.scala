package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRoleState extends StObject {
  
  var parameters: PathTeamslugUsername
  
  var requestBody: js.UndefOr[ContentApplicationjson123] = js.undefined
  
  var responses: `200ContentApplicationjsonRoleState`
}
object Responses200ContentApplicationjsonRoleState {
  
  inline def apply(parameters: PathTeamslugUsername, responses: `200ContentApplicationjsonRoleState`): Responses200ContentApplicationjsonRoleState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRoleState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRoleState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonRoleState`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
