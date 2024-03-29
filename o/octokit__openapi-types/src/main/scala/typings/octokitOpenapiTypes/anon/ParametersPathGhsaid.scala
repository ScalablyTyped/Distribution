package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGhsaid extends StObject {
  
  var parameters: PathGhsaid
  
  var responses: `200Content411`
}
object ParametersPathGhsaid {
  
  inline def apply(parameters: PathGhsaid, responses: `200Content411`): ParametersPathGhsaid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGhsaid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGhsaid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGhsaid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content411`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
