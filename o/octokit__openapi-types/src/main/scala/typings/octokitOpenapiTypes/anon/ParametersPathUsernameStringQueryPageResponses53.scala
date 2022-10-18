package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPageResponses53 extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `53`
}
object ParametersPathUsernameStringQueryPageResponses53 {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `53`): ParametersPathUsernameStringQueryPageResponses53 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPageResponses53]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPageResponses53](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `53`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
