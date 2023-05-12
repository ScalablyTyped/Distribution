package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath394 extends StObject {
  
  var parameters: Path394
  
  var responses: `200Content94304`
}
object ParametersPath394 {
  
  inline def apply(parameters: Path394, responses: `200Content94304`): ParametersPath394 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath394]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath394] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path394): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content94304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
