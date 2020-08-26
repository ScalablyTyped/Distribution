package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposListForAuthenticatedUserEndpoint = js.native
  var request: ReposListForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReposListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListForAuthenticatedUserEndpoint,
    request: ReposListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListForAuthenticatedUserEndpointOps[Self <: ParametersReposListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

