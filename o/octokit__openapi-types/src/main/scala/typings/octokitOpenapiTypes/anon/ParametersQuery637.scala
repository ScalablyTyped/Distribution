package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery637 extends StObject {
  
  var parameters: Query637
  
  var responses: `200ContentApplicationjsonClonesCount`
}
object ParametersQuery637 {
  
  inline def apply(parameters: Query637, responses: `200ContentApplicationjsonClonesCount`): ParametersQuery637 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery637]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery637] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query637): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonClonesCount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
