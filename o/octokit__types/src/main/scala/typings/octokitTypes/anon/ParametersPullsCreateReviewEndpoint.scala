package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCreateReviewEndpoint extends js.Object {
  
  var parameters: PullsCreateReviewEndpoint = js.native
  
  var request: PullsCreateReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsCreateReviewResponseData] = js.native
}
object ParametersPullsCreateReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCreateReviewEndpoint,
    request: PullsCreateReviewRequestOptions,
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): ParametersPullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCreateReviewEndpointOps[Self <: ParametersPullsCreateReviewEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsCreateReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
