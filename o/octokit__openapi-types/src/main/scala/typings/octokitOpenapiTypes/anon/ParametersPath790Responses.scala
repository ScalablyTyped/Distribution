package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath790Responses extends StObject {
  
  var parameters: Path790
}
object ParametersPath790Responses {
  
  inline def apply(parameters: Path790): ParametersPath790Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath790Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath790Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path790): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
