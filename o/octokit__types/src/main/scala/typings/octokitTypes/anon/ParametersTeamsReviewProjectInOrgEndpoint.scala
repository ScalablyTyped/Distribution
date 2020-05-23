package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsReviewProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsReviewProjectInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsReviewProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsReviewProjectInOrgEndpoint extends js.Object {
  var parameters: TeamsReviewProjectInOrgEndpoint
  var request: TeamsReviewProjectInOrgRequestOptions
  var response: OctokitResponse[TeamsReviewProjectInOrgResponseData]
}

object ParametersTeamsReviewProjectInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsReviewProjectInOrgEndpoint,
    request: TeamsReviewProjectInOrgRequestOptions,
    response: OctokitResponse[TeamsReviewProjectInOrgResponseData]
  ): ParametersTeamsReviewProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsReviewProjectInOrgEndpoint]
  }
}

