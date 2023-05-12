package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberUsernameString extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var requestBody: js.UndefOr[Content126] = js.undefined
  
  var responses: `304401Content36403Content36`
}
object ParametersPathProjectidNumberUsernameString {
  
  inline def apply(parameters: PathProjectidNumberUsernameString, responses: `304401Content36403Content36`): ParametersPathProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidNumberUsernameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content126): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `304401Content36403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
