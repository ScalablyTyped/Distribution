package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookid extends StObject {
  
  var parameters: PathHookid
  
  var responses: `20077`
}
object ParametersPathHookid {
  
  inline def apply(parameters: PathHookid, responses: `20077`): ParametersPathHookid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookid]
  }
  
  extension [Self <: ParametersPathHookid](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20077`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
