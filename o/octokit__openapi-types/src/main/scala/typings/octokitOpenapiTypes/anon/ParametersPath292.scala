package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292 extends StObject {
  
  var parameters: Path292
  
  var responses: `200301304`
}
object ParametersPath292 {
  
  inline def apply(parameters: Path292, responses: `200301304`): ParametersPath292 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292]
  }
  
  extension [Self <: ParametersPath292](x: Self) {
    
    inline def setParameters(value: Path292): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200301304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
