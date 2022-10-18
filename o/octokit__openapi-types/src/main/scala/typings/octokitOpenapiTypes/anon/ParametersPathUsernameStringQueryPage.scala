package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPage extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `200Content18`
}
object ParametersPathUsernameStringQueryPage {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `200Content18`): ParametersPathUsernameStringQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPage]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPage](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content18`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
