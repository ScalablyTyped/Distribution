package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsCreateColumnEndpoint extends js.Object {
  var parameters: ProjectsCreateColumnEndpoint = js.native
  var request: ProjectsCreateColumnRequestOptions = js.native
  var response: OctokitResponse[ProjectsCreateColumnResponseData] = js.native
}

object ParametersProjectsCreateColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateColumnEndpoint,
    request: ProjectsCreateColumnRequestOptions,
    response: OctokitResponse[ProjectsCreateColumnResponseData]
  ): ParametersProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateColumnEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsCreateColumnEndpointOps[Self <: ParametersProjectsCreateColumnEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsCreateColumnEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsCreateColumnRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateColumnResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

