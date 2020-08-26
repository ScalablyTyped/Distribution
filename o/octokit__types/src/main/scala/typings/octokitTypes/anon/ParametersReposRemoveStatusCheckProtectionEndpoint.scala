package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposRemoveStatusCheckProtectionEndpoint extends js.Object {
  var parameters: ReposRemoveStatusCheckProtectionEndpoint = js.native
  var request: ReposRemoveStatusCheckProtectionRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReposRemoveStatusCheckProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckProtectionEndpoint,
    request: ReposRemoveStatusCheckProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveStatusCheckProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposRemoveStatusCheckProtectionEndpointOps[Self <: ParametersReposRemoveStatusCheckProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposRemoveStatusCheckProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposRemoveStatusCheckProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

