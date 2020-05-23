package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentStatusesEndpoint extends js.Object {
  var deployment_id: Double
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListDeploymentStatusesEndpoint {
  @scala.inline
  def apply(
    deployment_id: Double,
    owner: String,
    repo: String,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ReposListDeploymentStatusesEndpoint = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListDeploymentStatusesEndpoint]
  }
}

