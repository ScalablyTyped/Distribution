package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeletePullRequestReviewProtectionEndpoint extends StObject {
  
  var parameters: ReposDeletePullRequestReviewProtectionEndpoint
  
  var request: ReposDeletePullRequestReviewProtectionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeletePullRequestReviewProtectionEndpoint {
  
  inline def apply(
    parameters: ReposDeletePullRequestReviewProtectionEndpoint,
    request: ReposDeletePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeletePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePullRequestReviewProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposDeletePullRequestReviewProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeletePullRequestReviewProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeletePullRequestReviewProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
