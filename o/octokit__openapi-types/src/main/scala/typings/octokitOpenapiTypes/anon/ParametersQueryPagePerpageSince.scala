package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSince extends StObject {
  
  var parameters: QueryPagePerpageSince
  
  var responses: `200Content167`
}
object ParametersQueryPagePerpageSince {
  
  inline def apply(parameters: QueryPagePerpageSince, responses: `200Content167`): ParametersQueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSince]
  }
  
  extension [Self <: ParametersQueryPagePerpageSince](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content167`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
