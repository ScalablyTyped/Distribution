package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSha extends StObject {
  
  var parameters: PathRepoSha
  
  var requestBody: ContentApplicationjsonTargeturl
  
  var responses: `201Content330`
}
object ParametersPathRepoSha {
  
  inline def apply(parameters: PathRepoSha, requestBody: ContentApplicationjsonTargeturl, responses: `201Content330`): ParametersPathRepoSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSha]
  }
  
  extension [Self <: ParametersPathRepoSha](x: Self) {
    
    inline def setParameters(value: PathRepoSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTargeturl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content330`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
