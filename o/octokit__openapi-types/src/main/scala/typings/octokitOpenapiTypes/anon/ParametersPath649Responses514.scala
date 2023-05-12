package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Responses514 extends StObject {
  
  var parameters: Path649
  
  var responses: `514`
}
object ParametersPath649Responses514 {
  
  inline def apply(parameters: Path649, responses: `514`): ParametersPath649Responses514 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Responses514]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Responses514] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `514`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
