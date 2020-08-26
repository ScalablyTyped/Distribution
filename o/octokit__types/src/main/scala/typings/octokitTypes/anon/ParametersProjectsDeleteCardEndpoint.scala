package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteCardRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsDeleteCardEndpoint extends js.Object {
  var parameters: ProjectsDeleteCardEndpoint = js.native
  var request: ProjectsDeleteCardRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersProjectsDeleteCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsDeleteCardEndpoint,
    request: ProjectsDeleteCardRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteCardEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsDeleteCardEndpointOps[Self <: ParametersProjectsDeleteCardEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsDeleteCardEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsDeleteCardRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

