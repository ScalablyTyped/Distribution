package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageQString extends StObject {
  
  var parameters: QueryPerpageQString
  
  var responses: `200ContentApplicationjson606`
}
object ParametersQueryPerpageQString {
  
  inline def apply(parameters: QueryPerpageQString, responses: `200ContentApplicationjson606`): ParametersQueryPerpageQString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageQString]
  }
  
  extension [Self <: ParametersQueryPerpageQString](x: Self) {
    
    inline def setParameters(value: QueryPerpageQString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson606`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
