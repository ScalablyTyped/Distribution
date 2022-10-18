package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery89 extends StObject {
  
  var parameters: Query89
  
  var responses: `200Content90`
}
object ParametersQuery89 {
  
  inline def apply(parameters: Query89, responses: `200Content90`): ParametersQuery89 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery89]
  }
  
  extension [Self <: ParametersQuery89](x: Self) {
    
    inline def setParameters(value: Query89): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
