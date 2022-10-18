package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath234 extends StObject {
  
  var parameters: Path234
  
  var responses: `200Content235`
}
object ParametersPath234 {
  
  inline def apply(parameters: Path234, responses: `200Content235`): ParametersPath234 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath234]
  }
  
  extension [Self <: ParametersPath234](x: Self) {
    
    inline def setParameters(value: Path234): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content235`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
