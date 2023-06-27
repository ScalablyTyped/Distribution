package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786Responses200Content596 extends StObject {
  
  var parameters: Path786
  
  var responses: `200Content596`
}
object ParametersPath786Responses200Content596 {
  
  inline def apply(parameters: Path786, responses: `200Content596`): ParametersPath786Responses200Content596 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786Responses200Content596]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786Responses200Content596] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content596`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
