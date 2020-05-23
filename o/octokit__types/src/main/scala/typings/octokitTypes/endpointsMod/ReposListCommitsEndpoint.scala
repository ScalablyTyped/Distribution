package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsEndpoint extends js.Object {
  /**
    * GitHub login or email address by which to filter by commit author.
    */
  var author: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Only commits containing this file path will be returned.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
  /**
    * SHA or branch to start listing commits from. Default: the repository’s default branch (usually `master`).
    */
  var sha: js.UndefOr[String] = js.undefined
  /**
    * Only commits after this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.undefined
  /**
    * Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var until: js.UndefOr[String] = js.undefined
}

object ReposListCommitsEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    author: String = null,
    page: js.UndefOr[Double] = js.undefined,
    path: String = null,
    per_page: js.UndefOr[Double] = js.undefined,
    sha: String = null,
    since: String = null,
    until: String = null
  ): ReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCommitsEndpoint]
  }
}

