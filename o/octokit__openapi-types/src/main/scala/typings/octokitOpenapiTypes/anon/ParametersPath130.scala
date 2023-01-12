package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath130 extends StObject {
  
  var parameters: Path130
  
  var responses: `200Content100`
}
object ParametersPath130 {
  
  inline def apply(parameters: Path130, responses: `200Content100`): ParametersPath130 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath130]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath130] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path130): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content100`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
