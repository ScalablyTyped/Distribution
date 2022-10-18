package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery107 extends StObject {
  
  var parameters: Query107
  
  var responses: `200ContentApplicationjsonErrorsArray`
}
object ParametersQuery107 {
  
  inline def apply(parameters: Query107, responses: `200ContentApplicationjsonErrorsArray`): ParametersQuery107 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery107]
  }
  
  extension [Self <: ParametersQuery107](x: Self) {
    
    inline def setParameters(value: Query107): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonErrorsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
