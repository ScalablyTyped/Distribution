package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsGetCommentEndpoint extends js.Object {
  var parameters: GistsGetCommentEndpoint
  var request: GistsGetCommentRequestOptions
  var response: OctokitResponse[GistsGetCommentResponseData]
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
}

