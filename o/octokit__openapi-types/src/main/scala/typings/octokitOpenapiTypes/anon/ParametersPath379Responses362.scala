package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath379Responses362 extends StObject {
  
  var parameters: Path379
  
  var responses: `362`
}
object ParametersPath379Responses362 {
  
  inline def apply(parameters: Path379, responses: `362`): ParametersPath379Responses362 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath379Responses362]
  }
  
  extension [Self <: ParametersPath379Responses362](x: Self) {
    
    inline def setParameters(value: Path379): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `362`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
