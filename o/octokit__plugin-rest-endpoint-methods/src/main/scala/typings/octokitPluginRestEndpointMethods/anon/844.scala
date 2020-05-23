package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typings.octokitTypes.endpointsMod.PullsListFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `844` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsListFilesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsListFilesResponseData]
}

object `844` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListFilesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListFilesResponseData]
  ): `844` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`844`]
  }
}

