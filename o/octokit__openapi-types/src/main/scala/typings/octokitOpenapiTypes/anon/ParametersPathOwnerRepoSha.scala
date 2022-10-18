package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoSha extends StObject {
  
  var parameters: PathOwnerRepoSha
  
  var requestBody: ContentApplicationjsonContextDescription
  
  var responses: `201ContentApplicationjsonTargeturl`
}
object ParametersPathOwnerRepoSha {
  
  inline def apply(
    parameters: PathOwnerRepoSha,
    requestBody: ContentApplicationjsonContextDescription,
    responses: `201ContentApplicationjsonTargeturl`
  ): ParametersPathOwnerRepoSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoSha]
  }
  
  extension [Self <: ParametersPathOwnerRepoSha](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContextDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonTargeturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
