package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsUpdateCommentEndpoint extends js.Object {
  var parameters: GistsUpdateCommentEndpoint
  var request: GistsUpdateCommentRequestOptions
  var response: OctokitResponse[GistsUpdateCommentResponseData]
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
}

