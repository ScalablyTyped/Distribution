package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommentsForCommitParams extends js.Object {
  var commit_sha: java.lang.String
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ReposListCommentsForCommitParams {
  @scala.inline
  def apply(
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReposListCommentsForCommitParams = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCommentsForCommitParams]
  }
}

