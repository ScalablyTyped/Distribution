package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Responses304401Content36403Content36 extends StObject {
  
  var parameters: Path649
  
  var responses: `304401Content36403Content36`
}
object ParametersPath649Responses304401Content36403Content36 {
  
  inline def apply(parameters: Path649, responses: `304401Content36403Content36`): ParametersPath649Responses304401Content36403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Responses304401Content36403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Responses304401Content36403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content36403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
