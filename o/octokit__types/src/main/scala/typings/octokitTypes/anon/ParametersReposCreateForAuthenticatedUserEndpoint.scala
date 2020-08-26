package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCreateForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposCreateForAuthenticatedUserEndpoint = js.native
  var request: ReposCreateForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData] = js.native
}

object ParametersReposCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateForAuthenticatedUserEndpoint,
    request: ReposCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
  ): ParametersReposCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersReposCreateForAuthenticatedUserEndpointOps[Self <: ParametersReposCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCreateForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCreateForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

