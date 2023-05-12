package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFilter extends StObject {
  
  var parameters: QueryFilter
  
  var responses: `200Content32`
}
object ParametersQueryFilter {
  
  inline def apply(parameters: QueryFilter, responses: `200Content32`): ParametersQueryFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryFilter] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content32`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
