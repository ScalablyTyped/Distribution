package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidUsername extends StObject {
  
  var parameters: PathProjectidUsername
  
  var requestBody: js.UndefOr[Content149] = js.undefined
  
  var responses: `158`
}
object ParametersPathProjectidUsername {
  
  inline def apply(parameters: PathProjectidUsername, responses: `158`): ParametersPathProjectidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content149): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `158`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
