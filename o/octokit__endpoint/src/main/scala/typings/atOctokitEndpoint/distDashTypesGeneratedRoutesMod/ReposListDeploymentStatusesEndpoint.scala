package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentStatusesEndpoint extends js.Object {
  var deployment_id: Double
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListDeploymentStatusesEndpoint {
  @scala.inline
  def apply(
    deployment_id: Double,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListDeploymentStatusesEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListDeploymentStatusesEndpoint]
  }
}

