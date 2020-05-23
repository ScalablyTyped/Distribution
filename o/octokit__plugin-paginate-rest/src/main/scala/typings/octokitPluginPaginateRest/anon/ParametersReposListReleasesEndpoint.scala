package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListReleasesEndpoint extends js.Object {
  var parameters: ReposListReleasesEndpoint
  var response: OctokitResponse[ReposListReleasesResponseData]
}

object ParametersReposListReleasesEndpoint {
  @scala.inline
  def apply(parameters: ReposListReleasesEndpoint, response: OctokitResponse[ReposListReleasesResponseData]): ParametersReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleasesEndpoint]
  }
}

