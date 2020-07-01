package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `967` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListCommitCommentsForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
}

object `967` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommitCommentsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
  ): `967` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`967`]
  }
}

