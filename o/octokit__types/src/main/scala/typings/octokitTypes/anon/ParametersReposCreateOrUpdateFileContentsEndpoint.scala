package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCreateOrUpdateFileContentsEndpoint extends js.Object {
  var parameters: ReposCreateOrUpdateFileContentsEndpoint = js.native
  var request: ReposCreateOrUpdateFileContentsRequestOptions = js.native
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ] = js.native
}

object ParametersReposCreateOrUpdateFileContentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateOrUpdateFileContentsEndpoint,
    request: ReposCreateOrUpdateFileContentsRequestOptions,
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): ParametersReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateOrUpdateFileContentsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposCreateOrUpdateFileContentsEndpointOps[Self <: ParametersReposCreateOrUpdateFileContentsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCreateOrUpdateFileContentsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCreateOrUpdateFileContentsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
        ]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

