package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses422ContentApplicationjsonDocumentationurl extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `422ContentApplicationjsonDocumentationurl`
}
object ParametersPathUsernameStringResponses422ContentApplicationjsonDocumentationurl {
  
  inline def apply(parameters: PathUsernameString, responses: `422ContentApplicationjsonDocumentationurl`): ParametersPathUsernameStringResponses422ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses422ContentApplicationjsonDocumentationurl]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses422ContentApplicationjsonDocumentationurl](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
