package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery411 extends StObject {
  
  var parameters: Query411
  
  var responses: `200Content71Headers25`
}
object ParametersQuery411 {
  
  inline def apply(parameters: Query411, responses: `200Content71Headers25`): ParametersQuery411 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery411]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery411] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query411): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content71Headers25`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
