package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeUsernameQueryToken extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsernameQueryToken
  
  var responses: `401Content55403Content55`
}
object ParametersPathPackagenamePackagetypeUsernameQueryToken {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsernameQueryToken, responses: `401Content55403Content55`): ParametersPathPackagenamePackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeUsernameQueryToken]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypeUsernameQueryToken](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsernameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
