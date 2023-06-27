package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameResponses9 extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `9`
}
object ParametersPathSecretnameResponses9 {
  
  inline def apply(parameters: PathSecretname, responses: `9`): ParametersPathSecretnameResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecretnameResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
