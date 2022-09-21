package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery112 extends StObject {
  
  var parameters: Query112
  
  var responses: `200Content113`
}
object ParametersQuery112 {
  
  inline def apply(parameters: Query112, responses: `200Content113`): ParametersQuery112 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery112]
  }
  
  extension [Self <: ParametersQuery112](x: Self) {
    
    inline def setParameters(value: Query112): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
