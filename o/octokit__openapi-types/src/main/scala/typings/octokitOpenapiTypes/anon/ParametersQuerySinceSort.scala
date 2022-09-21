package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySinceSort extends StObject {
  
  var parameters: QuerySinceSort
  
  var responses: `200Content263`
}
object ParametersQuerySinceSort {
  
  inline def apply(parameters: QuerySinceSort, responses: `200Content263`): ParametersQuerySinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySinceSort]
  }
  
  extension [Self <: ParametersQuerySinceSort](x: Self) {
    
    inline def setParameters(value: QuerySinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content263`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
