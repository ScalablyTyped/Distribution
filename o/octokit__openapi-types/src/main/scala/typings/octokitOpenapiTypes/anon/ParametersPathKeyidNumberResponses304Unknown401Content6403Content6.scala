package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidNumberResponses304Unknown401Content6403Content6 extends StObject {
  
  var parameters: PathKeyidNumber
  
  var responses: `304Unknown401Content6403Content6`
}
object ParametersPathKeyidNumberResponses304Unknown401Content6403Content6 {
  
  inline def apply(parameters: PathKeyidNumber, responses: `304Unknown401Content6403Content6`): ParametersPathKeyidNumberResponses304Unknown401Content6403Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidNumberResponses304Unknown401Content6403Content6]
  }
  
  extension [Self <: ParametersPathKeyidNumberResponses304Unknown401Content6403Content6](x: Self) {
    
    inline def setParameters(value: PathKeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content6403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
