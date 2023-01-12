package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery524 extends StObject {
  
  var parameters: Query524
  
  var responses: `200Content525`
}
object ParametersQuery524 {
  
  inline def apply(parameters: Query524, responses: `200Content525`): ParametersQuery524 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery524]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery524] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query524): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content525`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
