package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidResponses extends StObject {
  
  var parameters: PathProjectid
}
object ParametersPathProjectidResponses {
  
  inline def apply(parameters: PathProjectid): ParametersPathProjectidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidResponses]
  }
  
  extension [Self <: ParametersPathProjectidResponses](x: Self) {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
