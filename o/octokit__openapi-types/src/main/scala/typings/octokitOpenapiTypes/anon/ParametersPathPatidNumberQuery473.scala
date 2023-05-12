package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatidNumberQuery473 extends StObject {
  
  var parameters: PathPatidNumberQuery473
  
  var responses: `200403404500`
}
object ParametersPathPatidNumberQuery473 {
  
  inline def apply(parameters: PathPatidNumberQuery473, responses: `200403404500`): ParametersPathPatidNumberQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatidNumberQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
