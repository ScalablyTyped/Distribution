package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSince extends StObject {
  
  var parameters: QueryPagePerpageSince
  
  var responses: `200Content418`
}
object ParametersQueryPagePerpageSince {
  
  inline def apply(parameters: QueryPagePerpageSince, responses: `200Content418`): ParametersQueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content418`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
