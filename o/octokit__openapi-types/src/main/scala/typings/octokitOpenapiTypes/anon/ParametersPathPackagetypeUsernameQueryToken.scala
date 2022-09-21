package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsernameQueryToken extends StObject {
  
  var parameters: PathPackagetypeUsernameQueryToken
  
  var responses: `401403404`
}
object ParametersPathPackagetypeUsernameQueryToken {
  
  inline def apply(parameters: PathPackagetypeUsernameQueryToken, responses: `401403404`): ParametersPathPackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsernameQueryToken]
  }
  
  extension [Self <: ParametersPathPackagetypeUsernameQueryToken](x: Self) {
    
    inline def setParameters(value: PathPackagetypeUsernameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
