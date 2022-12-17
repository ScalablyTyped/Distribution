package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrg extends StObject {
  
  var parameters: PathHookidOrg
  
  var responses: `200444`
}
object ParametersPathHookidOrg {
  
  inline def apply(parameters: PathHookidOrg, responses: `200444`): ParametersPathHookidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrg]
  }
  
  extension [Self <: ParametersPathHookidOrg](x: Self) {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200444`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
