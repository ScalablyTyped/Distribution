package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberQuery426 extends StObject {
  
  var parameters: PathProjectidNumberQuery426
  
  var responses: `200Content490`
}
object ParametersPathProjectidNumberQuery426 {
  
  inline def apply(parameters: PathProjectidNumberQuery426, responses: `200Content490`): ParametersPathProjectidNumberQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberQuery426]
  }
  
  extension [Self <: ParametersPathProjectidNumberQuery426](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content490`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
