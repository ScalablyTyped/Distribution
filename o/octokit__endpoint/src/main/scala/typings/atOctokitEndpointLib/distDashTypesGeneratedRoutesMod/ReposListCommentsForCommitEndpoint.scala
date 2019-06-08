package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitEndpoint extends js.Object {
  var commit_sha: java.lang.String
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposListCommentsForCommitEndpoint {
  @scala.inline
  def apply(
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    ref: java.lang.String = null
  ): ReposListCommentsForCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposListCommentsForCommitEndpoint]
  }
}

