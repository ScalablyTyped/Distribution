package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonGithubownedallowed`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonGithubownedallowed`): ParametersPathOrgStringResponses200ContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: ParametersPathOrgStringResponses200ContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonGithubownedallowed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
