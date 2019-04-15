package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForAuthenticatedUserParams extends js.Object {
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
  ] = js.undefined
  /**
    * Indicates which sorts of issues to return. Can be one of:
    * \* `assigned`: Issues assigned to you
    * \* `created`: Issues created by you
    * \* `mentioned`: Issues mentioning you
    * \* `subscribed`: Issues you're subscribed to updates for
    * \* `all`: All issues the authenticated user can see, regardless of participation or creation
    */
  var filter: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.assigned | atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.mentioned | atOctokitRestLib.atOctokitRestLibStrings.subscribed | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  /**
    * A list of comma separated label names. Example: `bug,ui,@high`
    */
  var labels: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
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

object IssuesListForAuthenticatedUserParams {
  @scala.inline
  def apply(
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    filter: atOctokitRestLib.atOctokitRestLibStrings.assigned | atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.mentioned | atOctokitRestLib.atOctokitRestLibStrings.subscribed | atOctokitRestLib.atOctokitRestLibStrings.all = null,
    labels: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.comments = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed | atOctokitRestLib.atOctokitRestLibStrings.all = null
  ): IssuesListForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListForAuthenticatedUserParams]
  }
}

