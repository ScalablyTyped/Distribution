package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath251 extends StObject {
  
  var parameters: Path251
}
object ParametersPath251 {
  
  inline def apply(parameters: Path251): ParametersPath251 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath251]
  }
  
  extension [Self <: ParametersPath251](x: Self) {
    
    inline def setParameters(value: Path251): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
