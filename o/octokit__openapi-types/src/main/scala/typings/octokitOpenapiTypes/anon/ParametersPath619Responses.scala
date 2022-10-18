package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath619Responses extends StObject {
  
  var parameters: Path619
}
object ParametersPath619Responses {
  
  inline def apply(parameters: Path619): ParametersPath619Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath619Responses]
  }
  
  extension [Self <: ParametersPath619Responses](x: Self) {
    
    inline def setParameters(value: Path619): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
