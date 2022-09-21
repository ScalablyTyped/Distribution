package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath366Responses extends StObject {
  
  var parameters: Path366
}
object ParametersPath366Responses {
  
  inline def apply(parameters: Path366): ParametersPath366Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath366Responses]
  }
  
  extension [Self <: ParametersPath366Responses](x: Self) {
    
    inline def setParameters(value: Path366): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
