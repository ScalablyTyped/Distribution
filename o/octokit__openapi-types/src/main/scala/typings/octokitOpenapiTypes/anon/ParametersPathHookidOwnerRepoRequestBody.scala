package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoRequestBody extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var requestBody: js.UndefOr[ContentApplicationjsonContenttypeInsecuressl] = js.undefined
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOwnerRepoRequestBody {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `200ContentApplicationjsonContenttype`): ParametersPathHookidOwnerRepoRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
