package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint = js.native
  var request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData] = js.native
}

object ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListRepoNotificationsForAuthenticatedUserEndpoint,
    request: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityListRepoNotificationsForAuthenticatedUserEndpointOps[Self <: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityListRepoNotificationsForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityListRepoNotificationsForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

