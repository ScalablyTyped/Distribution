package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath364Responses extends StObject {
  
  var parameters: Path364
}
object ParametersPath364Responses {
  
  inline def apply(parameters: Path364): ParametersPath364Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath364Responses]
  }
  
  extension [Self <: ParametersPath364Responses](x: Self) {
    
    inline def setParameters(value: Path364): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
