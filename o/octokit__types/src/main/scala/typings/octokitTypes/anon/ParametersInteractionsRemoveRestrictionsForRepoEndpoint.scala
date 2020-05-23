package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsRemoveRestrictionsForRepoEndpoint extends js.Object {
  var parameters: InteractionsRemoveRestrictionsForRepoEndpoint
  var request: InteractionsRemoveRestrictionsForRepoRequestOptions
  var response: OctokitResponse[_]
}

object ParametersInteractionsRemoveRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForRepoEndpoint,
    request: InteractionsRemoveRestrictionsForRepoRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForRepoEndpoint]
  }
}

