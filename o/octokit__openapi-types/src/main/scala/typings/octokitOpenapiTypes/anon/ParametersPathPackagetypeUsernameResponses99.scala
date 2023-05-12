package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsernameResponses99 extends StObject {
  
  var parameters: PathPackagetypeUsername
  
  var responses: `99`
}
object ParametersPathPackagetypeUsernameResponses99 {
  
  inline def apply(parameters: PathPackagetypeUsername, responses: `99`): ParametersPathPackagetypeUsernameResponses99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsernameResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypeUsernameResponses99] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
