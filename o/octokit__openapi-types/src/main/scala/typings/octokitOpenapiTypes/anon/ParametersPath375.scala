package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath375 extends StObject {
  
  var parameters: Path375
  
  var responses: `200Content376`
}
object ParametersPath375 {
  
  inline def apply(parameters: Path375, responses: `200Content376`): ParametersPath375 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath375]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath375] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path375): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
