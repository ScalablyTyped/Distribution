package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCreateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsCreateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsCreateCommentEndpoint extends js.Object {
  var parameters: GistsCreateCommentEndpoint
  var request: GistsCreateCommentRequestOptions
  var response: OctokitResponse[GistsCreateCommentResponseData]
}

object ParametersGistsCreateCommentEndpoint {
  @scala.inline
  def apply(
    parameters: GistsCreateCommentEndpoint,
    request: GistsCreateCommentRequestOptions,
    response: OctokitResponse[GistsCreateCommentResponseData]
  ): ParametersGistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateCommentEndpoint]
  }
}

