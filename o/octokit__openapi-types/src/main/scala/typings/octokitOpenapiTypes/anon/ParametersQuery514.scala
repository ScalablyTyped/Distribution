package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery514 extends StObject {
  
  var parameters: Query514
  
  var responses: `400ContentApplicationjsonApplicationscimjson`
}
object ParametersQuery514 {
  
  inline def apply(parameters: Query514, responses: `400ContentApplicationjsonApplicationscimjson`): ParametersQuery514 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery514]
  }
  
  extension [Self <: ParametersQuery514](x: Self) {
    
    inline def setParameters(value: Query514): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400ContentApplicationjsonApplicationscimjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
