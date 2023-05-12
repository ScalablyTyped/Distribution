package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery530 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery530
  
  var responses: `200Content531`
}
object ParametersPathDiscussionnumberNumberQuery530 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery530, responses: `200Content531`): ParametersPathDiscussionnumberNumberQuery530 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery530]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberQuery530] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery530): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content531`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
