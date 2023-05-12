package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery589 extends StObject {
  
  var parameters: Query589
  
  var responses: `200Content590`
}
object ParametersQuery589 {
  
  inline def apply(parameters: Query589, responses: `200Content590`): ParametersQuery589 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery589]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery589] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query589): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
