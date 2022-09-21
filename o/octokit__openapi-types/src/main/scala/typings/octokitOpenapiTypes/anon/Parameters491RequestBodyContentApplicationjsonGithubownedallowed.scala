package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object Parameters491RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonGithubownedallowed): Parameters491RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: Parameters491RequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
