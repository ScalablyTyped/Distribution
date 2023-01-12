package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery565 extends StObject {
  
  var parameters: Query565
  
  var responses: `200ContentApplicationjsonClonesCount`
}
object ParametersQuery565 {
  
  inline def apply(parameters: Query565, responses: `200ContentApplicationjsonClonesCount`): ParametersQuery565 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery565]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery565] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query565): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonClonesCount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
