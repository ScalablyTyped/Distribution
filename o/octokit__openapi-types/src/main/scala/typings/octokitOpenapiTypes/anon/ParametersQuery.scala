package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery extends StObject {
  
  var parameters: Query
  
  var responses: `400`
}
object ParametersQuery {
  
  inline def apply(parameters: Query, responses: `400`): ParametersQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery]
  }
  
  extension [Self <: ParametersQuery](x: Self) {
    
    inline def setParameters(value: Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
