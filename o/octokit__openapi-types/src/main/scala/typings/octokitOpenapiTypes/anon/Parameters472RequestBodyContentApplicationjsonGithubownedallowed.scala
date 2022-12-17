package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object Parameters472RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonGithubownedallowed): Parameters472RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: Parameters472RequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
