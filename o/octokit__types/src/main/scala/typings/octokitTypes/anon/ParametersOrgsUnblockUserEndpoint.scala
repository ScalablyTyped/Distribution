package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUnblockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUnblockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsUnblockUserEndpoint extends js.Object {
  var parameters: OrgsUnblockUserEndpoint = js.native
  var request: OrgsUnblockUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersOrgsUnblockUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUnblockUserEndpoint,
    request: OrgsUnblockUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsUnblockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUnblockUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsUnblockUserEndpointOps[Self <: ParametersOrgsUnblockUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsUnblockUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsUnblockUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

