package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringUsernameString extends StObject {
  
  var parameters: PathOrgStringUsernameString
  
  var responses: `200Content417`
}
object ParametersPathOrgStringUsernameString {
  
  inline def apply(parameters: PathOrgStringUsernameString, responses: `200Content417`): ParametersPathOrgStringUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringUsernameString]
  }
  
  extension [Self <: ParametersPathOrgStringUsernameString](x: Self) {
    
    inline def setParameters(value: PathOrgStringUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content417`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
