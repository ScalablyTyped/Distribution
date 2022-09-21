package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameStringResponses extends StObject {
  
  var parameters: PathSecretnameString
}
object ParametersPathSecretnameStringResponses {
  
  inline def apply(parameters: PathSecretnameString): ParametersPathSecretnameStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameStringResponses]
  }
  
  extension [Self <: ParametersPathSecretnameStringResponses](x: Self) {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
