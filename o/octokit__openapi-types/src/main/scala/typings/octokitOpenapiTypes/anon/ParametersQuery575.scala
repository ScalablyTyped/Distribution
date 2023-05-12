package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery575 extends StObject {
  
  var parameters: Query575
  
  var responses: `200Content576`
}
object ParametersQuery575 {
  
  inline def apply(parameters: Query575, responses: `200Content576`): ParametersQuery575 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery575]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery575] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query575): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content576`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
