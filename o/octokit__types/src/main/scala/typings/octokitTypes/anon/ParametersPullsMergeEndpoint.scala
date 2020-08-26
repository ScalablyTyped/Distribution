package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsMergeEndpoint
import typings.octokitTypes.endpointsMod.PullsMergeRequestOptions
import typings.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typings.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typings.octokitTypes.endpointsMod.PullsMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsMergeEndpoint extends js.Object {
  var parameters: PullsMergeEndpoint = js.native
  var request: PullsMergeRequestOptions = js.native
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data] = js.native
}

object ParametersPullsMergeEndpoint {
  @scala.inline
  def apply(
    parameters: PullsMergeEndpoint,
    request: PullsMergeRequestOptions,
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): ParametersPullsMergeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsMergeEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsMergeEndpointOps[Self <: ParametersPullsMergeEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsMergeEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsMergeRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(
      value: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

