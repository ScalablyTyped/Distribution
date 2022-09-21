package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery451 extends StObject {
  
  var parameters: Query451
  
  var responses: `200ContentApplicationjson452`
}
object ParametersQuery451 {
  
  inline def apply(parameters: Query451, responses: `200ContentApplicationjson452`): ParametersQuery451 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery451]
  }
  
  extension [Self <: ParametersQuery451](x: Self) {
    
    inline def setParameters(value: Query451): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson452`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
