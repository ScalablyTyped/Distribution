package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentsEndpoint extends js.Object {
  var environment: js.UndefOr[String] = js.undefined
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
  var task: js.UndefOr[String] = js.undefined
}

object ReposListDeploymentsEndpoint {
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
  ): ReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[ReposListDeploymentsEndpoint]
  }
}

