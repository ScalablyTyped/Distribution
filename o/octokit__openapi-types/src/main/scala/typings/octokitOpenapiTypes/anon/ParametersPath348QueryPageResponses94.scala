package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPageResponses94 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `94`
}
object ParametersPath348QueryPageResponses94 {
  
  inline def apply(parameters: Path348QueryPage, responses: `94`): ParametersPath348QueryPageResponses94 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPageResponses94]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348QueryPageResponses94] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `94`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
