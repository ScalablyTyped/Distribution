package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdatePullRequestReviewProtectionEndpoint extends js.Object {
  
  var parameters: ReposUpdatePullRequestReviewProtectionEndpoint = js.native
  
  var request: ReposUpdatePullRequestReviewProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData] = js.native
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
  implicit class ParametersReposUpdatePullRequestReviewProtectionEndpointOps[Self <: ParametersReposUpdatePullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ReposUpdatePullRequestReviewProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdatePullRequestReviewProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
