package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrgResponses236 extends StObject {
  
  var parameters: PathHookidOrg
  
  var responses: `236`
}
object ParametersPathHookidOrgResponses236 {
  
  inline def apply(parameters: PathHookidOrg, responses: `236`): ParametersPathHookidOrgResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrgResponses236]
  }
  
  extension [Self <: ParametersPathHookidOrgResponses236](x: Self) {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
