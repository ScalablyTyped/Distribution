package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySinceSort extends StObject {
  
  var parameters: QuerySinceSort
  
  var responses: `200Content314`
}
object ParametersQuerySinceSort {
  
  inline def apply(parameters: QuerySinceSort, responses: `200Content314`): ParametersQuerySinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySinceSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySinceSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content314`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
