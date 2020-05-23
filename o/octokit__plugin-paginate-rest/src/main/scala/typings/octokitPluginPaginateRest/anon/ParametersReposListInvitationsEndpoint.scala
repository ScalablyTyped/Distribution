package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListInvitationsEndpoint extends js.Object {
  var parameters: ReposListInvitationsEndpoint
  var response: OctokitResponse[ReposListInvitationsResponseData]
}

object ParametersReposListInvitationsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListInvitationsEndpoint,
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): ParametersReposListInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsEndpoint]
  }
}

