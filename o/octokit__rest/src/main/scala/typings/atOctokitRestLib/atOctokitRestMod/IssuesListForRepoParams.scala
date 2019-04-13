package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForRepoParams extends js.Object {
  /**
    * Can be the name of a user. Pass in `none` for issues with no assigned user, and `*` for issues assigned to any user.
    */
  var assignee: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user that created the issue.
    */
  var creator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
  ] = js.undefined
  /**
    * A list of comma separated label names. Example: `bug,ui,@high`
    */
  var labels: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A user that's mentioned in the issue.
    */
  var mentioned: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If an `integer` is passed, it should refer to a milestone by its `number` field. If the string `*` is passed, issues with any milestone are accepted. If the string `none` is passed, issues without milestones are returned.
    */
  var milestone: js.UndefOr[java.lang.String] = js.undefined
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
  /**
    * Only issues updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What to sort results by. Can be either `created`, `updated`, `comments`.
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.comments
  ] = js.undefined
  /**
    * Indicates the state of the issues to return. Can be either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
}

object IssuesListForRepoParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    assignee: java.lang.String = null,
    creator: java.lang.String = null,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    labels: java.lang.String = null,
    mentioned: java.lang.String = null,
    milestone: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.comments = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all = null
  ): IssuesListForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (mentioned != null) __obj.updateDynamic("mentioned")(mentioned)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListForRepoParams]
  }
}

