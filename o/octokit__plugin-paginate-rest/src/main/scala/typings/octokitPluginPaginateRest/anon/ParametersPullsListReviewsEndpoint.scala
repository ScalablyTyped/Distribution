package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsListReviewsEndpoint extends js.Object {
  var parameters: PullsListReviewsEndpoint = js.native
  var response: OctokitResponse[PullsListReviewsResponseData] = js.native
}

object ParametersPullsListReviewsEndpoint {
  @scala.inline
  def apply(parameters: PullsListReviewsEndpoint, response: OctokitResponse[PullsListReviewsResponseData]): ParametersPullsListReviewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewsEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsListReviewsEndpointOps[Self <: ParametersPullsListReviewsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsListReviewsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

