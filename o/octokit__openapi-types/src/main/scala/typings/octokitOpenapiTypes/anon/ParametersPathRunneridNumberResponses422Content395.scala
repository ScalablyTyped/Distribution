package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunneridNumberResponses422Content395 extends StObject {
  
  var parameters: PathRunneridNumber
  
  var responses: `422Content395`
}
object ParametersPathRunneridNumberResponses422Content395 {
  
  inline def apply(parameters: PathRunneridNumber, responses: `422Content395`): ParametersPathRunneridNumberResponses422Content395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunneridNumberResponses422Content395]
  }
  
  extension [Self <: ParametersPathRunneridNumberResponses422Content395](x: Self) {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
