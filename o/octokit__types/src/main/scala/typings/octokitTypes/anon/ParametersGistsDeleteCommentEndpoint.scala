package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsDeleteCommentEndpoint extends js.Object {
  var parameters: GistsDeleteCommentEndpoint
  var request: GistsDeleteCommentRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGistsDeleteCommentEndpoint {
  @scala.inline
  def apply(
    parameters: GistsDeleteCommentEndpoint,
    request: GistsDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteCommentEndpoint]
  }
}

