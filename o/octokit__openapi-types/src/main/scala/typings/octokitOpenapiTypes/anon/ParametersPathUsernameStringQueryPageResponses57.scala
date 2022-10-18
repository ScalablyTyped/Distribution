package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPageResponses57 extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `57`
}
object ParametersPathUsernameStringQueryPageResponses57 {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `57`): ParametersPathUsernameStringQueryPageResponses57 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPageResponses57]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPageResponses57](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `57`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
