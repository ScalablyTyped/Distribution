package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQuerySince extends StObject {
  
  var parameters: PathUsernameStringQuerySince
  
  var responses: `200Content19`
}
object ParametersPathUsernameStringQuerySince {
  
  inline def apply(parameters: PathUsernameStringQuerySince, responses: `200Content19`): ParametersPathUsernameStringQuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQuerySince]
  }
  
  extension [Self <: ParametersPathUsernameStringQuerySince](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content19`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
