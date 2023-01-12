package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object Parameters433RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: `433`, requestBody: ContentApplicationjsonGithubownedallowed): Parameters433RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters433RequestBodyContentApplicationjsonGithubownedallowed] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
