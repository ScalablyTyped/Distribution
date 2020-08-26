package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteLabelRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesDeleteLabelEndpoint extends js.Object {
  var parameters: IssuesDeleteLabelEndpoint = js.native
  var request: IssuesDeleteLabelRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersIssuesDeleteLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesDeleteLabelEndpoint,
    request: IssuesDeleteLabelRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteLabelEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesDeleteLabelEndpointOps[Self <: ParametersIssuesDeleteLabelEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesDeleteLabelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IssuesDeleteLabelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

