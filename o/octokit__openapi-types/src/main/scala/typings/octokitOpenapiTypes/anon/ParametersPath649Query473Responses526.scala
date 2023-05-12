package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Query473Responses526 extends StObject {
  
  var parameters: Path649Query473
  
  var responses: `526`
}
object ParametersPath649Query473Responses526 {
  
  inline def apply(parameters: Path649Query473, responses: `526`): ParametersPath649Query473Responses526 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Query473Responses526]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Query473Responses526] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `526`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
