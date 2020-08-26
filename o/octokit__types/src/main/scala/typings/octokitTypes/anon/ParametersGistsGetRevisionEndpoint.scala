package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRevisionRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsGetRevisionEndpoint extends js.Object {
  var parameters: GistsGetRevisionEndpoint = js.native
  var request: GistsGetRevisionRequestOptions = js.native
  var response: OctokitResponse[GistsGetRevisionResponseData] = js.native
}

object ParametersGistsGetRevisionEndpoint {
  @scala.inline
  def apply(
    parameters: GistsGetRevisionEndpoint,
    request: GistsGetRevisionRequestOptions,
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): ParametersGistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetRevisionEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsGetRevisionEndpointOps[Self <: ParametersGistsGetRevisionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsGetRevisionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsGetRevisionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetRevisionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

