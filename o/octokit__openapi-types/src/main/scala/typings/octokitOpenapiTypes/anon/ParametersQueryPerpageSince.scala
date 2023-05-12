package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSince extends StObject {
  
  var parameters: QueryPerpageSince
  
  var responses: `200Content271`
}
object ParametersQueryPerpageSince {
  
  inline def apply(parameters: QueryPerpageSince, responses: `200Content271`): ParametersQueryPerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content271`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
