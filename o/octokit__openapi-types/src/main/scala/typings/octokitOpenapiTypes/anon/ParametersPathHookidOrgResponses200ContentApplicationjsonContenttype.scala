package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgResponses200ContentApplicationjsonContenttype extends StObject {
  
  var parameters: PathHookidOrg
  
  var responses: `200ContentApplicationjsonContenttype`
}
object ParametersPathHookidOrgResponses200ContentApplicationjsonContenttype {
  
  inline def apply(parameters: PathHookidOrg, responses: `200ContentApplicationjsonContenttype`): ParametersPathHookidOrgResponses200ContentApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgResponses200ContentApplicationjsonContenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrgResponses200ContentApplicationjsonContenttype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContenttype`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
