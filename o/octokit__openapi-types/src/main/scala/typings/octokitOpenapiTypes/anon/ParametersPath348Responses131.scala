package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348Responses131 extends StObject {
  
  var parameters: Path348
  
  var responses: `131`
}
object ParametersPath348Responses131 {
  
  inline def apply(parameters: Path348, responses: `131`): ParametersPath348Responses131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348Responses131]
  }
  
  extension [Self <: ParametersPath348Responses131](x: Self) {
    
    inline def setParameters(value: Path348): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `131`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
