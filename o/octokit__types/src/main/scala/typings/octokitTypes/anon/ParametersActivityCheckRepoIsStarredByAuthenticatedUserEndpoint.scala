package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint = js.native
  var request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint,
    request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpointOps[Self <: ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

