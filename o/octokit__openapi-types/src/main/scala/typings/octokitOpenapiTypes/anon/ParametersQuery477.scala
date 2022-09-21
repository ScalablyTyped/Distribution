package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery477 extends StObject {
  
  var parameters: Query477
  
  var responses: `200ContentApplicationjson406`
}
object ParametersQuery477 {
  
  inline def apply(parameters: Query477, responses: `200ContentApplicationjson406`): ParametersQuery477 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery477]
  }
  
  extension [Self <: ParametersQuery477](x: Self) {
    
    inline def setParameters(value: Query477): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson406`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
