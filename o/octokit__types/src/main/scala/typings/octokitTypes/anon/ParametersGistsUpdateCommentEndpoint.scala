package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsUpdateCommentEndpoint extends js.Object {
  var parameters: GistsUpdateCommentEndpoint = js.native
  var request: GistsUpdateCommentRequestOptions = js.native
  var response: OctokitResponse[GistsUpdateCommentResponseData] = js.native
}

object ParametersGistsUpdateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: GistsUpdateCommentEndpoint,
    request: GistsUpdateCommentRequestOptions,
    response: OctokitResponse[GistsUpdateCommentResponseData]
  ): ParametersGistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUpdateCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsUpdateCommentEndpointOps[Self <: ParametersGistsUpdateCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsUpdateCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsUpdateCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsUpdateCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

