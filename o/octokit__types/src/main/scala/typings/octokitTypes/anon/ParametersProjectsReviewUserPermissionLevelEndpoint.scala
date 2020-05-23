package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsReviewUserPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ProjectsReviewUserPermissionLevelRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsReviewUserPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsReviewUserPermissionLevelEndpoint extends js.Object {
  var parameters: ProjectsReviewUserPermissionLevelEndpoint
  var request: ProjectsReviewUserPermissionLevelRequestOptions
  var response: OctokitResponse[ProjectsReviewUserPermissionLevelResponseData]
}

object ParametersProjectsReviewUserPermissionLevelEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsReviewUserPermissionLevelEndpoint,
    request: ProjectsReviewUserPermissionLevelRequestOptions,
    response: OctokitResponse[ProjectsReviewUserPermissionLevelResponseData]
  ): ParametersProjectsReviewUserPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsReviewUserPermissionLevelEndpoint]
  }
}

