package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath652Responses extends StObject {
  
  var parameters: Path652
}
object ParametersPath652Responses {
  
  inline def apply(parameters: Path652): ParametersPath652Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath652Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath652Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path652): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
