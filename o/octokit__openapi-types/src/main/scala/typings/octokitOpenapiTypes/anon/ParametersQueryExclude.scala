package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryExclude extends StObject {
  
  var parameters: QueryExclude
  
  var responses: `200Content97`
}
object ParametersQueryExclude {
  
  inline def apply(parameters: QueryExclude, responses: `200Content97`): ParametersQueryExclude = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryExclude]
  }
  
  extension [Self <: ParametersQueryExclude](x: Self) {
    
    inline def setParameters(value: QueryExclude): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content97`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
