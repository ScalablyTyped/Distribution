package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MarkdownRenderEndpoint
import typings.octokitTypes.endpointsMod.MarkdownRenderRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMarkdownRenderEndpoint extends js.Object {
  var parameters: MarkdownRenderEndpoint
  var request: MarkdownRenderRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMarkdownRenderEndpoint {
  @scala.inline
  def apply(
    parameters: MarkdownRenderEndpoint,
    request: MarkdownRenderRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMarkdownRenderEndpoint]
  }
}

