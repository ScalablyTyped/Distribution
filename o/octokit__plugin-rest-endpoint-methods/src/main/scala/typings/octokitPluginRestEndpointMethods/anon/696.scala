package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `696` extends js.Object {
  var parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
}

object `696` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): `696` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`696`]
  }
}

