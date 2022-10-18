package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath642 extends StObject {
  
  var parameters: Path642
  
  var responses: `200Content353`
}
object ParametersPath642 {
  
  inline def apply(parameters: Path642, responses: `200Content353`): ParametersPath642 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath642]
  }
  
  extension [Self <: ParametersPath642](x: Self) {
    
    inline def setParameters(value: Path642): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content353`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
