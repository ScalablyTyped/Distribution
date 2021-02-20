package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPullRequestReviewProtectionEndpoint extends StObject {
  
  var parameters: ReposGetPullRequestReviewProtectionEndpoint = js.native
  
  var request: ReposGetPullRequestReviewProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData] = js.native
}
object ParametersReposGetPullRequestReviewProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPullRequestReviewProtectionEndpoint,
    request: ReposGetPullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
  ): ParametersReposGetPullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPullRequestReviewProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPullRequestReviewProtectionEndpointMutableBuilder[Self <: ParametersReposGetPullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetPullRequestReviewProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPullRequestReviewProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
