package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath607Query371 extends StObject {
  
  var parameters: Path607Query371
  
  var responses: `200Content369`
}
object ParametersPath607Query371 {
  
  inline def apply(parameters: Path607Query371, responses: `200Content369`): ParametersPath607Query371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath607Query371]
  }
  
  extension [Self <: ParametersPath607Query371](x: Self) {
    
    inline def setParameters(value: Path607Query371): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content369`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
