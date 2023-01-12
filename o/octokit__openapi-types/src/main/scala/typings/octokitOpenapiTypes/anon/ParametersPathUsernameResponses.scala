package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameResponses extends StObject {
  
  var parameters: PathUsername
}
object ParametersPathUsernameResponses {
  
  inline def apply(parameters: PathUsername): ParametersPathUsernameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathUsernameResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
