package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQuery250 extends StObject {
  
  var parameters: PathOwnerReleaseidQuery250
  
  var responses: `200Content576`
}
object ParametersPathOwnerReleaseidQuery250 {
  
  inline def apply(parameters: PathOwnerReleaseidQuery250, responses: `200Content576`): ParametersPathOwnerReleaseidQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQuery250]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidQuery250](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseidQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content576`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
