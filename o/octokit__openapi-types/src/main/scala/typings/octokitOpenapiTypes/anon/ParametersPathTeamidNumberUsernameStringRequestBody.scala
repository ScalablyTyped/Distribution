package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberUsernameStringRequestBody extends StObject {
  
  var parameters: PathTeamidNumberUsernameString
  
  var requestBody: js.UndefOr[ContentApplicationjson146] = js.undefined
  
  var responses: `200ContentApplicationjsonRoleState404Content41`
}
object ParametersPathTeamidNumberUsernameStringRequestBody {
  
  inline def apply(
    parameters: PathTeamidNumberUsernameString,
    responses: `200ContentApplicationjsonRoleState404Content41`
  ): ParametersPathTeamidNumberUsernameStringRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberUsernameStringRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberUsernameStringRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson146): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonRoleState404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
