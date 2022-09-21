package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQSort extends StObject {
  
  var parameters: QueryQSort
  
  var responses: `304422503`
}
object ParametersQueryQSort {
  
  inline def apply(parameters: QueryQSort, responses: `304422503`): ParametersQueryQSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQSort]
  }
  
  extension [Self <: ParametersQueryQSort](x: Self) {
    
    inline def setParameters(value: QueryQSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
