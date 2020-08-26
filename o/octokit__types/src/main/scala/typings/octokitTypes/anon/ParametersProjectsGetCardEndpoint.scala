package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsGetCardEndpoint extends js.Object {
  var parameters: ProjectsGetCardEndpoint = js.native
  var request: ProjectsGetCardRequestOptions = js.native
  var response: OctokitResponse[ProjectsGetCardResponseData] = js.native
}

object ParametersProjectsGetCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsGetCardEndpoint,
    request: ProjectsGetCardRequestOptions,
    response: OctokitResponse[ProjectsGetCardResponseData]
  ): ParametersProjectsGetCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetCardEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsGetCardEndpointOps[Self <: ParametersProjectsGetCardEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsGetCardEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsGetCardRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetCardResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

