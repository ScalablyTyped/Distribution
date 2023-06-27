package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionidResponses115 extends StObject {
  
  var parameters: PathPackageversionid
  
  var responses: `115`
}
object ParametersPathPackageversionidResponses115 {
  
  inline def apply(parameters: PathPackageversionid, responses: `115`): ParametersPathPackageversionidResponses115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionidResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackageversionidResponses115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
