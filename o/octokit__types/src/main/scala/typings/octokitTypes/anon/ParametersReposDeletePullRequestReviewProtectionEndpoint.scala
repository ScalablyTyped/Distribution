package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeletePullRequestReviewProtectionEndpoint extends StObject {
  
  var parameters: ReposDeletePullRequestReviewProtectionEndpoint = js.native
  
  var request: ReposDeletePullRequestReviewProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeletePullRequestReviewProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeletePullRequestReviewProtectionEndpoint,
    request: ReposDeletePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeletePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePullRequestReviewProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeletePullRequestReviewProtectionEndpointMutableBuilder[Self <: ParametersReposDeletePullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeletePullRequestReviewProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeletePullRequestReviewProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
