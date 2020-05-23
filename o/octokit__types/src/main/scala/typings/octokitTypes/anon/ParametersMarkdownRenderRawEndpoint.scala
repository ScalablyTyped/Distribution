package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MarkdownRenderRawEndpoint
import typings.octokitTypes.endpointsMod.MarkdownRenderRawRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMarkdownRenderRawEndpoint extends js.Object {
  var parameters: MarkdownRenderRawEndpoint
  var request: MarkdownRenderRawRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMarkdownRenderRawEndpoint {
  @scala.inline
  def apply(
    parameters: MarkdownRenderRawEndpoint,
    request: MarkdownRenderRawRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMarkdownRenderRawEndpoint]
  }
}

