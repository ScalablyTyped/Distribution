package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListBlockedUsersEndpoint extends js.Object {
  var parameters: OrgsListBlockedUsersEndpoint = js.native
  var request: OrgsListBlockedUsersRequestOptions = js.native
  var response: OctokitResponse[OrgsListBlockedUsersResponseData] = js.native
}

object ParametersOrgsListBlockedUsersEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListBlockedUsersEndpoint,
    request: OrgsListBlockedUsersRequestOptions,
    response: OctokitResponse[OrgsListBlockedUsersResponseData]
  ): ParametersOrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListBlockedUsersEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListBlockedUsersEndpointOps[Self <: ParametersOrgsListBlockedUsersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListBlockedUsersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsListBlockedUsersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListBlockedUsersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

