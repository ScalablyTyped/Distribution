package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery462 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery462
  
  var responses: `200Content463`
}
object ParametersPathDiscussionnumberNumberQuery462 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery462, responses: `200Content463`): ParametersPathDiscussionnumberNumberQuery462 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberQuery462] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery462): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content463`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
