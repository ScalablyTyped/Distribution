package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery216 extends StObject {
  
  var parameters: Query216
  
  var responses: `200Content217`
}
object ParametersQuery216 {
  
  inline def apply(parameters: Query216, responses: `200Content217`): ParametersQuery216 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery216]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery216] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query216): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content217`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
