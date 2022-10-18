package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317Responses extends StObject {
  
  var parameters: Path317
}
object ParametersPath317Responses {
  
  inline def apply(parameters: Path317): ParametersPath317Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317Responses]
  }
  
  extension [Self <: ParametersPath317Responses](x: Self) {
    
    inline def setParameters(value: Path317): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
