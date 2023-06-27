package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath78Responses extends StObject {
  
  var parameters: Path78
}
object ParametersPath78Responses {
  
  inline def apply(parameters: Path78): ParametersPath78Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath78Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath78Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path78): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
