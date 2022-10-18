package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeUsernameQueryToken extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsernameQueryToken
  
  var responses: `354`
}
object ParametersPathPackagenamePackagetypeUsernameQueryToken {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsernameQueryToken, responses: `354`): ParametersPathPackagenamePackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeUsernameQueryToken]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypeUsernameQueryToken](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsernameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
