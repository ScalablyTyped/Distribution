package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370Responses200Content6 extends StObject {
  
  var parameters: Path370
  
  var responses: `200Content6`
}
object ParametersPath370Responses200Content6 {
  
  inline def apply(parameters: Path370, responses: `200Content6`): ParametersPath370Responses200Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370Responses200Content6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370Responses200Content6] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
