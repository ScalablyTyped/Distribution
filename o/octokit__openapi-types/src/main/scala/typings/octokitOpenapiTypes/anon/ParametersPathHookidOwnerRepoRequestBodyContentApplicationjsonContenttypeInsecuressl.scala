package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonContenttypeInsecuressl extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var requestBody: ContentApplicationjsonContenttypeInsecuressl
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonContenttypeInsecuressl {
  
  inline def apply(
    parameters: PathHookidOwnerRepo,
    requestBody: ContentApplicationjsonContenttypeInsecuressl,
    responses: `200ContentApplicationjsonContenttype`
  ): ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonContenttypeInsecuressl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonContenttypeInsecuressl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoRequestBodyContentApplicationjsonContenttypeInsecuressl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
