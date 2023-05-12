package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOrg extends StObject {
  
  var parameters: PathHookidOrg
  
  var responses: `200513`
}
object ParametersPathHookidOrg {
  
  inline def apply(parameters: PathHookidOrg, responses: `200513`): ParametersPathHookidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOrg] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200513`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
