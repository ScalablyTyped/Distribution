package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQuery426 extends StObject {
  
  var parameters: PathOwnerReleaseidQuery426
  
  var responses: `200Content573`
}
object ParametersPathOwnerReleaseidQuery426 {
  
  inline def apply(parameters: PathOwnerReleaseidQuery426, responses: `200Content573`): ParametersPathOwnerReleaseidQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQuery426]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidQuery426](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseidQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content573`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
