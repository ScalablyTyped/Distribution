package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577Query457 extends StObject {
  
  var parameters: Path577Query457
  
  var responses: `200Content458422Content397`
}
object ParametersPath577Query457 {
  
  inline def apply(parameters: Path577Query457, responses: `200Content458422Content397`): ParametersPath577Query457 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577Query457]
  }
  
  extension [Self <: ParametersPath577Query457](x: Self) {
    
    inline def setParameters(value: Path577Query457): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content458422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
