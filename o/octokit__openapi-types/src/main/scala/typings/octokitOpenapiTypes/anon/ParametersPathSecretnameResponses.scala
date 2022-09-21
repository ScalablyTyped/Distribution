package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameResponses extends StObject {
  
  var parameters: PathSecretname
}
object ParametersPathSecretnameResponses {
  
  inline def apply(parameters: PathSecretname): ParametersPathSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameResponses]
  }
  
  extension [Self <: ParametersPathSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
