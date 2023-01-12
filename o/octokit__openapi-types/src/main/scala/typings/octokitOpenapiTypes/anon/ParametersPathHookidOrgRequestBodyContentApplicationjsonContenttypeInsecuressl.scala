package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgRequestBodyContentApplicationjsonContenttypeInsecuressl extends StObject {
  
  var parameters: PathHookidOrg
  
  var requestBody: ContentApplicationjsonContenttypeInsecuressl
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOrgRequestBodyContentApplicationjsonContenttypeInsecuressl {
  
  inline def apply(
    parameters: PathHookidOrg,
    requestBody: ContentApplicationjsonContenttypeInsecuressl,
    responses: `200ContentApplicationjsonContenttype`
  ): ParametersPathHookidOrgRequestBodyContentApplicationjsonContenttypeInsecuressl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgRequestBodyContentApplicationjsonContenttypeInsecuressl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrgRequestBodyContentApplicationjsonContenttypeInsecuressl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContenttypeInsecuressl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
