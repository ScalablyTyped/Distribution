package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath244 extends StObject {
  
  var parameters: Path244
  
  var responses: `200Content245`
}
object ParametersPath244 {
  
  inline def apply(parameters: Path244, responses: `200Content245`): ParametersPath244 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath244]
  }
  
  extension [Self <: ParametersPath244](x: Self) {
    
    inline def setParameters(value: Path244): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content245`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
