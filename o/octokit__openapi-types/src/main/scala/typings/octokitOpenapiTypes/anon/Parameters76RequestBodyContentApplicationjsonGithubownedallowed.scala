package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters76RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object Parameters76RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonGithubownedallowed): Parameters76RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters76RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: Parameters76RequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
