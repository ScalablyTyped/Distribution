package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery188 extends StObject {
  
  var parameters: Query188
  
  var responses: `200Content189`
}
object ParametersQuery188 {
  
  inline def apply(parameters: Query188, responses: `200Content189`): ParametersQuery188 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery188]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery188] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query188): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content189`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
