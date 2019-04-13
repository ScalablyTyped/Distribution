package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsParams extends js.Object {
  /**
    * GitHub login or email address by which to filter by commit author.
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only commits containing this file path will be returned.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  /**
    * SHA or branch to start listing commits from.
    */
  var sha: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only commits after this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var until: js.UndefOr[java.lang.String] = js.undefined
}

object ReposListCommitsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    author: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    per_page: scala.Int | scala.Double = null,
    sha: java.lang.String = null,
    since: java.lang.String = null,
    until: java.lang.String = null
  ): ReposListCommitsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (author != null) __obj.updateDynamic("author")(author)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (since != null) __obj.updateDynamic("since")(since)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[ReposListCommitsParams]
  }
}

