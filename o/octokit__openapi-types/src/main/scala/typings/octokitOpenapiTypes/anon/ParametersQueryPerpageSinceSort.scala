package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSinceSort extends StObject {
  
  var parameters: QueryPerpageSinceSort
  
  var responses: `200Content594`
}
object ParametersQueryPerpageSinceSort {
  
  inline def apply(parameters: QueryPerpageSinceSort, responses: `200Content594`): ParametersQueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSinceSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageSinceSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageSinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content594`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
