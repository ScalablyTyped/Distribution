package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposMergeEndpoint
import typings.octokitTypes.endpointsMod.ReposMergeResponse404Data
import typings.octokitTypes.endpointsMod.ReposMergeResponse409Data
import typings.octokitTypes.endpointsMod.ReposMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `981` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposMergeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
}

object `981` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
  ): `981` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`981`]
  }
}

