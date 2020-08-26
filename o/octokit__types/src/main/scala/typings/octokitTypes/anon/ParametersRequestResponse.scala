package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersRequestResponse extends js.Object {
  var parameters: AppsRevokeAuthorizationForApplicationEndpoint = js.native
  var request: AppsRevokeAuthorizationForApplicationRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersRequestResponse {
  @scala.inline
  def apply(
    parameters: AppsRevokeAuthorizationForApplicationEndpoint,
    request: AppsRevokeAuthorizationForApplicationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersRequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestResponse]
  }
  @scala.inline
  implicit class ParametersRequestResponseOps[Self <: ParametersRequestResponse] (val x: Self) extends AnyVal {
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
    def setParameters(value: AppsRevokeAuthorizationForApplicationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: AppsRevokeAuthorizationForApplicationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

