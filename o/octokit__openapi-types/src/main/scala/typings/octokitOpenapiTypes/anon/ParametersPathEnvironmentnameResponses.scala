package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameResponses extends StObject {
  
  var parameters: PathEnvironmentname
}
object ParametersPathEnvironmentnameResponses {
  
  inline def apply(parameters: PathEnvironmentname): ParametersPathEnvironmentnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameResponses]
  }
  
  extension [Self <: ParametersPathEnvironmentnameResponses](x: Self) {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
