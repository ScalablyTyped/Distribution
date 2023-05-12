package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameResponses7 extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `7`
}
object ParametersPathSecretnameResponses7 {
  
  inline def apply(parameters: PathSecretname, responses: `7`): ParametersPathSecretnameResponses7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecretnameResponses7] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
