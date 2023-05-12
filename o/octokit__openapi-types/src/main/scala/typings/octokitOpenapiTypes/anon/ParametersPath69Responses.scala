package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath69Responses extends StObject {
  
  var parameters: Path69
}
object ParametersPath69Responses {
  
  inline def apply(parameters: Path69): ParametersPath69Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath69Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath69Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path69): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
