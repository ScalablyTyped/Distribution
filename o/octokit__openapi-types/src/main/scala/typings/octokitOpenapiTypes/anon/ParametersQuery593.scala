package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery593 extends StObject {
  
  var parameters: Query593
  
  var responses: `200Content594`
}
object ParametersQuery593 {
  
  inline def apply(parameters: Query593, responses: `200Content594`): ParametersQuery593 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery593]
  }
  
  extension [Self <: ParametersQuery593](x: Self) {
    
    inline def setParameters(value: Query593): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content594`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
