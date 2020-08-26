package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsRemoveOutsideCollaboratorEndpoint extends js.Object {
  var parameters: OrgsRemoveOutsideCollaboratorEndpoint = js.native
  var request: OrgsRemoveOutsideCollaboratorRequestOptions = js.native
  var response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData] = js.native
}

object ParametersOrgsRemoveOutsideCollaboratorEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveOutsideCollaboratorEndpoint,
    request: OrgsRemoveOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
  ): ParametersOrgsRemoveOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveOutsideCollaboratorEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsRemoveOutsideCollaboratorEndpointOps[Self <: ParametersOrgsRemoveOutsideCollaboratorEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsRemoveOutsideCollaboratorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsRemoveOutsideCollaboratorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

