package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentsParams extends js.Object {
  /**
    * The name of the environment that was deployed to (e.g., `staging` or `production`).
    */
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the ref. This can be a branch, tag, or SHA.
    */
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
  /**
    * The SHA recorded at creation time.
    */
  var sha: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[java.lang.String] = js.undefined
}

object ReposListDeploymentsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    environment: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    ref: java.lang.String = null,
    sha: java.lang.String = null,
    task: java.lang.String = null
  ): ReposListDeploymentsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[ReposListDeploymentsParams]
  }
}

