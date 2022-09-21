package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599QueryPagePerpageSince extends StObject {
  
  var parameters: Path599QueryPagePerpageSince
  
  var responses: `200Content436422Content421`
}
object ParametersPath599QueryPagePerpageSince {
  
  inline def apply(parameters: Path599QueryPagePerpageSince, responses: `200Content436422Content421`): ParametersPath599QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599QueryPagePerpageSince]
  }
  
  extension [Self <: ParametersPath599QueryPagePerpageSince](x: Self) {
    
    inline def setParameters(value: Path599QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content436422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
