package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersRequestOptions
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersSearchUsersEndpoint extends js.Object {
  var parameters: SearchUsersEndpoint = js.native
  var request: SearchUsersRequestOptions = js.native
  var response: OctokitResponse[SearchUsersResponseData] = js.native
}

object ParametersSearchUsersEndpoint {
  @scala.inline
  def apply(
    parameters: SearchUsersEndpoint,
    request: SearchUsersRequestOptions,
    response: OctokitResponse[SearchUsersResponseData]
  ): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
  @scala.inline
  implicit class ParametersSearchUsersEndpointOps[Self <: ParametersSearchUsersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: SearchUsersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: SearchUsersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[SearchUsersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

