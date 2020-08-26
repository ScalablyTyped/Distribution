package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsBlockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsBlockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsBlockUserEndpoint extends js.Object {
  var parameters: OrgsBlockUserEndpoint = js.native
  var request: OrgsBlockUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersOrgsBlockUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsBlockUserEndpoint,
    request: OrgsBlockUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsBlockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsBlockUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsBlockUserEndpointOps[Self <: ParametersOrgsBlockUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsBlockUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsBlockUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

