package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577QueryPackagetypeVisibility extends StObject {
  
  var parameters: Path577QueryPackagetypeVisibility
  
  var responses: `200Content454`
}
object ParametersPath577QueryPackagetypeVisibility {
  
  inline def apply(parameters: Path577QueryPackagetypeVisibility, responses: `200Content454`): ParametersPath577QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577QueryPackagetypeVisibility]
  }
  
  extension [Self <: ParametersPath577QueryPackagetypeVisibility](x: Self) {
    
    inline def setParameters(value: Path577QueryPackagetypeVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content454`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
