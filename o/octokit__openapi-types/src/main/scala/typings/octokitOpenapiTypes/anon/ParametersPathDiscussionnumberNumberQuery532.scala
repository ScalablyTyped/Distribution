package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery532 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery532
  
  var responses: `200Content533`
}
object ParametersPathDiscussionnumberNumberQuery532 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery532, responses: `200Content533`): ParametersPathDiscussionnumberNumberQuery532 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberQuery532] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery532): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content533`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
