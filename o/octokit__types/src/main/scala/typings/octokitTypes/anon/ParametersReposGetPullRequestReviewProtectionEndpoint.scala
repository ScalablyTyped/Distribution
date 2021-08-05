package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetPullRequestReviewProtectionEndpoint extends StObject {
  
  var parameters: ReposGetPullRequestReviewProtectionEndpoint
  
  var request: ReposGetPullRequestReviewProtectionRequestOptions
  
  var response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
}
object ParametersReposGetPullRequestReviewProtectionEndpoint {
  
  inline def apply(
    parameters: ReposGetPullRequestReviewProtectionEndpoint,
    request: ReposGetPullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
  ): ParametersReposGetPullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPullRequestReviewProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposGetPullRequestReviewProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetPullRequestReviewProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetPullRequestReviewProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
