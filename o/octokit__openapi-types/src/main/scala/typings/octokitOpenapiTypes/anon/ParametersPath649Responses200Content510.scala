package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Responses200Content510 extends StObject {
  
  var parameters: Path649
  
  var responses: `200Content510`
}
object ParametersPath649Responses200Content510 {
  
  inline def apply(parameters: Path649, responses: `200Content510`): ParametersPath649Responses200Content510 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Responses200Content510]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Responses200Content510] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content510`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
