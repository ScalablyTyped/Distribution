package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidNumberResponses401Content48403Content48404Content48 extends StObject {
  
  var parameters: PathKeyidNumber
  
  var responses: `401Content48403Content48404Content48`
}
object ParametersPathKeyidNumberResponses401Content48403Content48404Content48 {
  
  inline def apply(parameters: PathKeyidNumber, responses: `401Content48403Content48404Content48`): ParametersPathKeyidNumberResponses401Content48403Content48404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidNumberResponses401Content48403Content48404Content48]
  }
  
  extension [Self <: ParametersPathKeyidNumberResponses401Content48403Content48404Content48](x: Self) {
    
    inline def setParameters(value: PathKeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
