package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters37RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object Parameters37RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonGithubownedallowed): Parameters37RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters37RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: Parameters37RequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
