package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListPublicMembersEndpoint extends js.Object {
  var parameters: OrgsListPublicMembersEndpoint = js.native
  var request: OrgsListPublicMembersRequestOptions = js.native
  var response: OctokitResponse[OrgsListPublicMembersResponseData] = js.native
}

object ParametersOrgsListPublicMembersEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListPublicMembersEndpoint,
    request: OrgsListPublicMembersRequestOptions,
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): ParametersOrgsListPublicMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPublicMembersEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListPublicMembersEndpointOps[Self <: ParametersOrgsListPublicMembersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListPublicMembersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsListPublicMembersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPublicMembersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

