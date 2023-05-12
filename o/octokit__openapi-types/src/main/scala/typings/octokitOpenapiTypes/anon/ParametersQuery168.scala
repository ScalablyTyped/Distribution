package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery168 extends StObject {
  
  var parameters: Query168
  
  var responses: `200Content169`
}
object ParametersQuery168 {
  
  inline def apply(parameters: Query168, responses: `200Content169`): ParametersQuery168 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery168]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery168] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query168): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content169`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
