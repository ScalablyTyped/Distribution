package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersGistsGetCommentEndpoint extends js.Object {
  var parameters: GistsGetCommentEndpoint = js.native
  var request: GistsGetCommentRequestOptions = js.native
  var response: OctokitResponse[GistsGetCommentResponseData] = js.native
}

object ParametersGistsGetCommentEndpoint {
  @scala.inline
  def apply(
    parameters: GistsGetCommentEndpoint,
    request: GistsGetCommentRequestOptions,
    response: OctokitResponse[GistsGetCommentResponseData]
  ): ParametersGistsGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersGistsGetCommentEndpointOps[Self <: ParametersGistsGetCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: GistsGetCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GistsGetCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

