package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpagePinned extends StObject {
  
  var parameters: QueryPerpagePinned
  
  var responses: `200Content529`
}
object ParametersQueryPerpagePinned {
  
  inline def apply(parameters: QueryPerpagePinned, responses: `200Content529`): ParametersQueryPerpagePinned = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpagePinned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpagePinned] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpagePinned): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content529`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
