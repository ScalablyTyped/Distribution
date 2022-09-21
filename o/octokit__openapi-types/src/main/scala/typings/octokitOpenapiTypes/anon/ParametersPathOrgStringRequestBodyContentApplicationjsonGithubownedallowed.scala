package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object ParametersPathOrgStringRequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: PathOrgString, requestBody: ContentApplicationjsonGithubownedallowed): ParametersPathOrgStringRequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: ParametersPathOrgStringRequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
