package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringUsernameString extends StObject {
  
  var parameters: PathOrgStringUsernameString
  
  var responses: `200Content480`
}
object ParametersPathOrgStringUsernameString {
  
  inline def apply(parameters: PathOrgStringUsernameString, responses: `200Content480`): ParametersPathOrgStringUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringUsernameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
