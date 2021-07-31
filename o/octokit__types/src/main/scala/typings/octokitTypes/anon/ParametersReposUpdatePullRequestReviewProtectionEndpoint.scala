package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdatePullRequestReviewProtectionEndpoint extends StObject {
  
  var parameters: ReposUpdatePullRequestReviewProtectionEndpoint
  
  var request: ReposUpdatePullRequestReviewProtectionRequestOptions
  
  var response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
}
object ParametersReposUpdatePullRequestReviewProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdatePullRequestReviewProtectionEndpoint,
    request: ReposUpdatePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
  ): ParametersReposUpdatePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdatePullRequestReviewProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdatePullRequestReviewProtectionEndpointMutableBuilder[Self <: ParametersReposUpdatePullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdatePullRequestReviewProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdatePullRequestReviewProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
