package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionidResponses115 extends StObject {
  
  var parameters: PathPackagetypePackageversionid
  
  var responses: `115`
}
object ParametersPathPackagetypePackageversionidResponses115 {
  
  inline def apply(parameters: PathPackagetypePackageversionid, responses: `115`): ParametersPathPackagetypePackageversionidResponses115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionidResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypePackageversionidResponses115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
