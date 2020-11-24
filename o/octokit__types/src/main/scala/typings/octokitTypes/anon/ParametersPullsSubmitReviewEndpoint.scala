package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsSubmitReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsSubmitReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsSubmitReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsSubmitReviewEndpoint extends js.Object {
  
  var parameters: PullsSubmitReviewEndpoint = js.native
  
  var request: PullsSubmitReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsSubmitReviewResponseData] = js.native
}
object ParametersPullsSubmitReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsSubmitReviewEndpoint,
    request: PullsSubmitReviewRequestOptions,
    response: OctokitResponse[PullsSubmitReviewResponseData]
  ): ParametersPullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsSubmitReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsSubmitReviewEndpointOps[Self <: ParametersPullsSubmitReviewEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsSubmitReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsSubmitReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsSubmitReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
