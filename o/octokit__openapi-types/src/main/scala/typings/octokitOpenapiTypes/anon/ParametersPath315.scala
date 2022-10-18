package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath315 extends StObject {
  
  var parameters: Path315
}
object ParametersPath315 {
  
  inline def apply(parameters: Path315): ParametersPath315 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath315]
  }
  
  extension [Self <: ParametersPath315](x: Self) {
    
    inline def setParameters(value: Path315): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
