package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsRemoveRestrictionsForOrgEndpoint extends js.Object {
  var parameters: InteractionsRemoveRestrictionsForOrgEndpoint
  var request: InteractionsRemoveRestrictionsForOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersInteractionsRemoveRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForOrgEndpoint,
    request: InteractionsRemoveRestrictionsForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForOrgEndpoint]
  }
}

