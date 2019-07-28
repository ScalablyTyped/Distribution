package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitEndpoint extends js.Object {
  var commit_sha: String
  var owner: String
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReposListPullRequestsAssociatedWithCommitEndpoint {
  @scala.inline
  def apply(
    commit_sha: String,
    owner: String,
    repo: String,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitEndpoint]
  }
}

