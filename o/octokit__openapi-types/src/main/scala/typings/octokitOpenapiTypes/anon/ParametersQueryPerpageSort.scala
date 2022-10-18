package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSort extends StObject {
  
  var parameters: QueryPerpageSort
  
  var responses: `400ContentApplicationjsonApplicationscimjson`
}
object ParametersQueryPerpageSort {
  
  inline def apply(parameters: QueryPerpageSort, responses: `400ContentApplicationjsonApplicationscimjson`): ParametersQueryPerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSort]
  }
  
  extension [Self <: ParametersQueryPerpageSort](x: Self) {
    
    inline def setParameters(value: QueryPerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400ContentApplicationjsonApplicationscimjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
