package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSha extends StObject {
  
  var parameters: PathOwnerRepoSha
  
  var requestBody: ContentApplicationjsonTargeturl
  
  var responses: `201ContentApplicationjsonContextCreatedat`
}
object ParametersPathOwnerRepoSha {
  
  inline def apply(
    parameters: PathOwnerRepoSha,
    requestBody: ContentApplicationjsonTargeturl,
    responses: `201ContentApplicationjsonContextCreatedat`
  ): ParametersPathOwnerRepoSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSha]
  }
  
  extension [Self <: ParametersPathOwnerRepoSha](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTargeturl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonContextCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
