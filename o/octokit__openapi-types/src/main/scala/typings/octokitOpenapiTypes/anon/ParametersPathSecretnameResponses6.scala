package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameResponses6 extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `6`
}
object ParametersPathSecretnameResponses6 {
  
  inline def apply(parameters: PathSecretname, responses: `6`): ParametersPathSecretnameResponses6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameResponses6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecretnameResponses6] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
