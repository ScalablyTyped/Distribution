package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577Query593 extends StObject {
  
  var parameters: Path577Query593
  
  var responses: `200Content599`
}
object ParametersPath577Query593 {
  
  inline def apply(parameters: Path577Query593, responses: `200Content599`): ParametersPath577Query593 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577Query593]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath577Query593] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577Query593): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content599`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
