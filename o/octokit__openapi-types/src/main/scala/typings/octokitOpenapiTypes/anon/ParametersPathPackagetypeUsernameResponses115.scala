package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsernameResponses115 extends StObject {
  
  var parameters: PathPackagetypeUsername
  
  var responses: `115`
}
object ParametersPathPackagetypeUsernameResponses115 {
  
  inline def apply(parameters: PathPackagetypeUsername, responses: `115`): ParametersPathPackagetypeUsernameResponses115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsernameResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypeUsernameResponses115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
