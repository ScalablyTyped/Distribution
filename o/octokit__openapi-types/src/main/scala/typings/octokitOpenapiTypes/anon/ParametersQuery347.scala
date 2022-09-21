package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery347 extends StObject {
  
  var parameters: Query347
  
  var responses: `200304422`
}
object ParametersQuery347 {
  
  inline def apply(parameters: Query347, responses: `200304422`): ParametersQuery347 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery347]
  }
  
  extension [Self <: ParametersQuery347](x: Self) {
    
    inline def setParameters(value: Query347): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
