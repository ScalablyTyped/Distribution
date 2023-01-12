package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath577Query407Responses453 extends StObject {
  
  var parameters: Path577Query407
  
  var responses: `453`
}
object ParametersPath577Query407Responses453 {
  
  inline def apply(parameters: Path577Query407, responses: `453`): ParametersPath577Query407Responses453 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath577Query407Responses453]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath577Query407Responses453] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `453`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
