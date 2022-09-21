package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599QueryPackagetypeVisibility extends StObject {
  
  var parameters: Path599QueryPackagetypeVisibility
  
  var responses: `200Content470`
}
object ParametersPath599QueryPackagetypeVisibility {
  
  inline def apply(parameters: Path599QueryPackagetypeVisibility, responses: `200Content470`): ParametersPath599QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599QueryPackagetypeVisibility]
  }
  
  extension [Self <: ParametersPath599QueryPackagetypeVisibility](x: Self) {
    
    inline def setParameters(value: Path599QueryPackagetypeVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content470`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
