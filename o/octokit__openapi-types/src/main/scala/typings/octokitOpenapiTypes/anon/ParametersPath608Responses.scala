package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608Responses extends StObject {
  
  var parameters: Path608
}
object ParametersPath608Responses {
  
  inline def apply(parameters: Path608): ParametersPath608Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608Responses]
  }
  
  extension [Self <: ParametersPath608Responses](x: Self) {
    
    inline def setParameters(value: Path608): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
