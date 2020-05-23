package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `606` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
}

object `606` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
  ): `606` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`606`]
  }
}

