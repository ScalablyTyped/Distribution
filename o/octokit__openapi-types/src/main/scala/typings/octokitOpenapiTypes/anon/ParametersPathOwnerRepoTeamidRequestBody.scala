package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoTeamidRequestBody extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var requestBody: js.UndefOr[ContentApplicationjson441] = js.undefined
  
  var responses: `403Content41422Content414`
}
object ParametersPathOwnerRepoTeamidRequestBody {
  
  inline def apply(parameters: PathOwnerRepoTeamid, responses: `403Content41422Content414`): ParametersPathOwnerRepoTeamidRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoTeamidRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoTeamidRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson441): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403Content41422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
