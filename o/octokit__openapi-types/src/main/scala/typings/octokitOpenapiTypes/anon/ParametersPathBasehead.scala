package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBasehead extends StObject {
  
  var parameters: PathBasehead
  
  var responses: `404500503`
}
object ParametersPathBasehead {
  
  inline def apply(parameters: PathBasehead, responses: `404500503`): ParametersPathBasehead = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBasehead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBasehead] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBasehead): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
