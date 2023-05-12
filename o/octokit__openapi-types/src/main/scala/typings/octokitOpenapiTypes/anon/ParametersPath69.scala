package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath69 extends StObject {
  
  var parameters: Path69
  
  var responses: `200Content70`
}
object ParametersPath69 {
  
  inline def apply(parameters: Path69, responses: `200Content70`): ParametersPath69 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath69]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath69] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path69): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content70`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
