package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumberResponses401Content6 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var responses: `401Content6`
}
object ParametersPathColumnidNumberResponses401Content6 {
  
  inline def apply(parameters: PathColumnidNumber, responses: `401Content6`): ParametersPathColumnidNumberResponses401Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumberResponses401Content6]
  }
  
  extension [Self <: ParametersPathColumnidNumberResponses401Content6](x: Self) {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
