package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryInclude extends StObject {
  
  var parameters: QueryInclude
  
  var responses: `200Content25`
}
object ParametersQueryInclude {
  
  inline def apply(parameters: QueryInclude, responses: `200Content25`): ParametersQueryInclude = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryInclude]
  }
  
  extension [Self <: ParametersQueryInclude](x: Self) {
    
    inline def setParameters(value: QueryInclude): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content25`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
