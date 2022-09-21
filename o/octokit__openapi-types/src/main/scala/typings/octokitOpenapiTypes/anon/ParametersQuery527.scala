package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery527 extends StObject {
  
  var parameters: Query527
  
  var responses: `200Content528`
}
object ParametersQuery527 {
  
  inline def apply(parameters: Query527, responses: `200Content528`): ParametersQuery527 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery527]
  }
  
  extension [Self <: ParametersQuery527](x: Self) {
    
    inline def setParameters(value: Query527): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content528`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
