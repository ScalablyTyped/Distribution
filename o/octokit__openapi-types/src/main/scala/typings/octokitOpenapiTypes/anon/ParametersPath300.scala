package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath300 extends StObject {
  
  var parameters: Path300
  
  var responses: `200ContentApplicationjsonTotalcountNumber`
}
object ParametersPath300 {
  
  inline def apply(parameters: Path300, responses: `200ContentApplicationjsonTotalcountNumber`): ParametersPath300 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath300]
  }
  
  extension [Self <: ParametersPath300](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
