package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPagePerpageSince extends StObject {
  
  var parameters: QueryDirectionPagePerpageSince
  
  var responses: `200Content613`
}
object ParametersQueryDirectionPagePerpageSince {
  
  inline def apply(parameters: QueryDirectionPagePerpageSince, responses: `200Content613`): ParametersQueryDirectionPagePerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPagePerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryDirectionPagePerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryDirectionPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content613`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
