package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidUsernameRequestBody extends StObject {
  
  var parameters: PathTeamidUsername
  
  var requestBody: js.UndefOr[ContentApplicationjson123] = js.undefined
  
  var responses: `200Content122404`
}
object ParametersPathTeamidUsernameRequestBody {
  
  inline def apply(parameters: PathTeamidUsername, responses: `200Content122404`): ParametersPathTeamidUsernameRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidUsernameRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidUsernameRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content122404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
