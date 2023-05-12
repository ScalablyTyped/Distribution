package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery623 extends StObject {
  
  var parameters: Query623
  
  var responses: `200Content533404Content36`
}
object ParametersQuery623 {
  
  inline def apply(parameters: Query623, responses: `200Content533404Content36`): ParametersQuery623 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery623]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery623] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query623): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content533404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
