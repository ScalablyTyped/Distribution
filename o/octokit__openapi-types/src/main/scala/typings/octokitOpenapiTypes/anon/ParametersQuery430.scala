package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery430 extends StObject {
  
  var parameters: Query430
  
  var responses: `200Content431`
}
object ParametersQuery430 {
  
  inline def apply(parameters: Query430, responses: `200Content431`): ParametersQuery430 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery430]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery430] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query430): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content431`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
