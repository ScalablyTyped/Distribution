package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgRequestBody extends StObject {
  
  var parameters: PathHookidOrg
  
  var requestBody: js.UndefOr[ContentApplicationjsonContenttypeInsecuressl] = js.undefined
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOrgRequestBody {
  
  inline def apply(parameters: PathHookidOrg, responses: `200ContentApplicationjsonContenttype`): ParametersPathHookidOrgRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrgRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
