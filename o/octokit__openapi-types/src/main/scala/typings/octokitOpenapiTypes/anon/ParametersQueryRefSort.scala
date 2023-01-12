package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryRefSort extends StObject {
  
  var parameters: QueryRefSort
  
  var responses: `200304403404503`
}
object ParametersQueryRefSort {
  
  inline def apply(parameters: QueryRefSort, responses: `200304403404503`): ParametersQueryRefSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryRefSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryRefSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryRefSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
