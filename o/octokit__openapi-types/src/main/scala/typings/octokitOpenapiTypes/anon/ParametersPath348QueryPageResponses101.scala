package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPageResponses101 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `101`
}
object ParametersPath348QueryPageResponses101 {
  
  inline def apply(parameters: Path348QueryPage, responses: `101`): ParametersPath348QueryPageResponses101 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPageResponses101]
  }
  
  extension [Self <: ParametersPath348QueryPageResponses101](x: Self) {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
