package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBody extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: js.UndefOr[ContentApplicationjsonTitle] = js.undefined
  
  var responses: `200Content135`
}
object ParametersPathDiscussionnumberTeamidRequestBody {
  
  inline def apply(parameters: PathDiscussionnumberTeamid, responses: `200Content135`): ParametersPathDiscussionnumberTeamidRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberTeamidRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content135`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
