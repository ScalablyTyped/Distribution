package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSince extends StObject {
  
  var parameters: QueryPerpageSince
  
  var responses: `200Content63`
}
object ParametersQueryPerpageSince {
  
  inline def apply(parameters: QueryPerpageSince, responses: `200Content63`): ParametersQueryPerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSince]
  }
  
  extension [Self <: ParametersQueryPerpageSince](x: Self) {
    
    inline def setParameters(value: QueryPerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
