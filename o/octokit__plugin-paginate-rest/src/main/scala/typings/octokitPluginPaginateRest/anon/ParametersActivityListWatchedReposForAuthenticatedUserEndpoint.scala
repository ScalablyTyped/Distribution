package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint = js.native
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData] = js.native
}

object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityListWatchedReposForAuthenticatedUserEndpointOps[Self <: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityListWatchedReposForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

