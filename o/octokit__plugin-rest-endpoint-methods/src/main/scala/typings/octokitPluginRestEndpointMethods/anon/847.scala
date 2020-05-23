package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsMergeEndpoint
import typings.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typings.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typings.octokitTypes.endpointsMod.PullsMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `847` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
}

object `847` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): `847` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`847`]
  }
}

