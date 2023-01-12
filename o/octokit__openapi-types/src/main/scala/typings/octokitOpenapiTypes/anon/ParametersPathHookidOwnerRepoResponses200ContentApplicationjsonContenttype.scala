package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoResponses200ContentApplicationjsonContenttype extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOwnerRepoResponses200ContentApplicationjsonContenttype {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `200ContentApplicationjsonContenttype`): ParametersPathHookidOwnerRepoResponses200ContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoResponses200ContentApplicationjsonContenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoResponses200ContentApplicationjsonContenttype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
