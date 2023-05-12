package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery530 extends StObject {
  
  var parameters: Query530
  
  var responses: `200Content531`
}
object ParametersQuery530 {
  
  inline def apply(parameters: Query530, responses: `200Content531`): ParametersQuery530 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery530]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery530] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query530): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content531`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
