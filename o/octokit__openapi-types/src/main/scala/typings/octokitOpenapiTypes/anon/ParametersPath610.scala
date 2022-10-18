package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath610 extends StObject {
  
  var parameters: Path610
  
  var responses: `404Unknown`
}
object ParametersPath610 {
  
  inline def apply(parameters: Path610, responses: `404Unknown`): ParametersPath610 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath610]
  }
  
  extension [Self <: ParametersPath610](x: Self) {
    
    inline def setParameters(value: Path610): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
