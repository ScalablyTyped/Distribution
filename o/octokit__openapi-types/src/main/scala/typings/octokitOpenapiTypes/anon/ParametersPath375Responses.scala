package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath375Responses extends StObject {
  
  var parameters: Path375
}
object ParametersPath375Responses {
  
  inline def apply(parameters: Path375): ParametersPath375Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath375Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath375Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path375): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
