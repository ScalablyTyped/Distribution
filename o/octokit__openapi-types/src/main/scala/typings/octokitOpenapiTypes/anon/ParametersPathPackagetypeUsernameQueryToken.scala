package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsernameQueryToken extends StObject {
  
  var parameters: PathPackagetypeUsernameQueryToken
  
  var responses: `99`
}
object ParametersPathPackagetypeUsernameQueryToken {
  
  inline def apply(parameters: PathPackagetypeUsernameQueryToken, responses: `99`): ParametersPathPackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsernameQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypeUsernameQueryToken] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsernameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
