package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsReviewProjectLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsReviewProjectLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsReviewProjectLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsReviewProjectLegacyEndpoint extends js.Object {
  var parameters: TeamsReviewProjectLegacyEndpoint
  var request: TeamsReviewProjectLegacyRequestOptions
  var response: OctokitResponse[TeamsReviewProjectLegacyResponseData]
}

object ParametersTeamsReviewProjectLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsReviewProjectLegacyEndpoint,
    request: TeamsReviewProjectLegacyRequestOptions,
    response: OctokitResponse[TeamsReviewProjectLegacyResponseData]
  ): ParametersTeamsReviewProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsReviewProjectLegacyEndpoint]
  }
}

