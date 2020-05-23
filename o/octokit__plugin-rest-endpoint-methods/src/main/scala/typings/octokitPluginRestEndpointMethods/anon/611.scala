package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typings.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `611` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
}

object `611` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): `611` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`611`]
  }
}

