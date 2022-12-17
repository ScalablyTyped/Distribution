package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQuery407 extends StObject {
  
  var parameters: PathOwnerReleaseidQuery407
  
  var responses: `200Content554`
}
object ParametersPathOwnerReleaseidQuery407 {
  
  inline def apply(parameters: PathOwnerReleaseidQuery407, responses: `200Content554`): ParametersPathOwnerReleaseidQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQuery407]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidQuery407](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseidQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content554`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
