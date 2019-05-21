package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentsEndpoint extends js.Object {
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
  var task: js.UndefOr[java.lang.String] = js.undefined
}

object ReposListDeploymentsEndpoint {
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

