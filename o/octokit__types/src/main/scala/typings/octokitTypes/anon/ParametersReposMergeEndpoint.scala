package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposMergeEndpoint
import typings.octokitTypes.endpointsMod.ReposMergeRequestOptions
import typings.octokitTypes.endpointsMod.ReposMergeResponse404Data
import typings.octokitTypes.endpointsMod.ReposMergeResponse409Data
import typings.octokitTypes.endpointsMod.ReposMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposMergeEndpoint extends js.Object {
  var parameters: ReposMergeEndpoint = js.native
  var request: ReposMergeRequestOptions = js.native
  var response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data] = js.native
}

object ParametersReposMergeEndpoint {
  @scala.inline
  def apply(
    parameters: ReposMergeEndpoint,
    request: ReposMergeRequestOptions,
    response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
  ): ParametersReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposMergeEndpoint]
  }
  @scala.inline
  implicit class ParametersReposMergeEndpointOps[Self <: ParametersReposMergeEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposMergeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposMergeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(
      value: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

