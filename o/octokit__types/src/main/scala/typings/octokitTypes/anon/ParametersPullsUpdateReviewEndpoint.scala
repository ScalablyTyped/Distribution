package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsUpdateReviewEndpoint extends js.Object {
  
  var parameters: PullsUpdateReviewEndpoint = js.native
  
  var request: PullsUpdateReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsUpdateReviewResponseData] = js.native
}
object ParametersPullsUpdateReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsUpdateReviewEndpoint,
    request: PullsUpdateReviewRequestOptions,
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): ParametersPullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsUpdateReviewEndpointOps[Self <: ParametersPullsUpdateReviewEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsUpdateReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsUpdateReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
