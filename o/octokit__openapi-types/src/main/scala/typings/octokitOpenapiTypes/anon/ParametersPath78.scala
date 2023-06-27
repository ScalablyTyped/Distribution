package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath78 extends StObject {
  
  var parameters: Path78
  
  var responses: `200Content79`
}
object ParametersPath78 {
  
  inline def apply(parameters: Path78, responses: `200Content79`): ParametersPath78 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath78]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath78] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path78): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
