package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgResponses200Content229 extends StObject {
  
  var parameters: PathHookidOrg
  
  var responses: `200Content229`
}
object ParametersPathHookidOrgResponses200Content229 {
  
  inline def apply(parameters: PathHookidOrg, responses: `200Content229`): ParametersPathHookidOrgResponses200Content229 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgResponses200Content229]
  }
  
  extension [Self <: ParametersPathHookidOrgResponses200Content229](x: Self) {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
