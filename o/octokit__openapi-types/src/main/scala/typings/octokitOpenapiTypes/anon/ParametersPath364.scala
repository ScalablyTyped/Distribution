package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath364 extends StObject {
  
  var parameters: Path364
  
  var responses: `409Unknown`
}
object ParametersPath364 {
  
  inline def apply(parameters: Path364, responses: `409Unknown`): ParametersPath364 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath364]
  }
  
  extension [Self <: ParametersPath364](x: Self) {
    
    inline def setParameters(value: Path364): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
