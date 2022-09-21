package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery585 extends StObject {
  
  var parameters: Query585
  
  var responses: `200ContentApplicationjsonClonesCount`
}
object ParametersQuery585 {
  
  inline def apply(parameters: Query585, responses: `200ContentApplicationjsonClonesCount`): ParametersQuery585 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery585]
  }
  
  extension [Self <: ParametersQuery585](x: Self) {
    
    inline def setParameters(value: Query585): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonClonesCount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
