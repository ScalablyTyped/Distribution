package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionidResponses99 extends StObject {
  
  var parameters: PathPackageversionid
  
  var responses: `99`
}
object ParametersPathPackageversionidResponses99 {
  
  inline def apply(parameters: PathPackageversionid, responses: `99`): ParametersPathPackageversionidResponses99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionidResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackageversionidResponses99] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
