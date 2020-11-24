package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsGetReviewEndpoint extends js.Object {
  
  var parameters: PullsGetReviewEndpoint = js.native
  
  var request: PullsGetReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsGetReviewResponseData] = js.native
}
object ParametersPullsGetReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsGetReviewEndpoint,
    request: PullsGetReviewRequestOptions,
    response: OctokitResponse[PullsGetReviewResponseData]
  ): ParametersPullsGetReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsGetReviewEndpointOps[Self <: ParametersPullsGetReviewEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsGetReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
