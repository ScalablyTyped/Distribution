package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySortState extends StObject {
  
  var parameters: QuerySortState
  
  var responses: `200Content296`
}
object ParametersQuerySortState {
  
  inline def apply(parameters: QuerySortState, responses: `200Content296`): ParametersQuerySortState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySortState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySortState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySortState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content296`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
