package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionidResponses99 extends StObject {
  
  var parameters: PathPackagetypePackageversionid
  
  var responses: `99`
}
object ParametersPathPackagetypePackageversionidResponses99 {
  
  inline def apply(parameters: PathPackagetypePackageversionid, responses: `99`): ParametersPathPackagetypePackageversionidResponses99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionidResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypePackageversionidResponses99] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
