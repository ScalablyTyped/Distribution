package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentsParams extends js.Object {
  /**
    * The name of the environment that was deployed to (e.g., `staging` or `production`).
    */
  var environment: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * The name of the ref. This can be a branch, tag, or SHA.
    */
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
  /**
    * The SHA recorded at creation time.
    */
  var sha: js.UndefOr[String] = js.undefined
  /**
    * The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.undefined
}

object ReposListDeploymentsParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    environment: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    ref: String = null,
    sha: String = null,
    task: String = null
  ): ReposListDeploymentsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListDeploymentsParams]
  }
}

