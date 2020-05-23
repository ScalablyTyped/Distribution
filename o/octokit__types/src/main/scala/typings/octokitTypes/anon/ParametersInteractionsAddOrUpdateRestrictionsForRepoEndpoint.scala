package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsAddOrUpdateRestrictionsForRepoEndpoint extends js.Object {
  var parameters: InteractionsAddOrUpdateRestrictionsForRepoEndpoint
  var request: InteractionsAddOrUpdateRestrictionsForRepoRequestOptions
  var response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForRepoResponseData]
}

object ParametersInteractionsAddOrUpdateRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsAddOrUpdateRestrictionsForRepoEndpoint,
    request: InteractionsAddOrUpdateRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForRepoResponseData]
  ): ParametersInteractionsAddOrUpdateRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsAddOrUpdateRestrictionsForRepoEndpoint]
  }
}

