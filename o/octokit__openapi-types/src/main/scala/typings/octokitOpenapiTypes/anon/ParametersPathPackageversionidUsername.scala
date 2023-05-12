package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionidUsername extends StObject {
  
  var parameters: PathPackageversionidUsername
  
  var responses: `200Content101`
}
object ParametersPathPackageversionidUsername {
  
  inline def apply(parameters: PathPackageversionidUsername, responses: `200Content101`): ParametersPathPackageversionidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionidUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackageversionidUsername] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackageversionidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
