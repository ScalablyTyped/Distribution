package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryPageResponses97 extends StObject {
  
  var parameters: Path370QueryPage
  
  var responses: `97`
}
object ParametersPath370QueryPageResponses97 {
  
  inline def apply(parameters: Path370QueryPage, responses: `97`): ParametersPath370QueryPageResponses97 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryPageResponses97]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryPageResponses97] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `97`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
